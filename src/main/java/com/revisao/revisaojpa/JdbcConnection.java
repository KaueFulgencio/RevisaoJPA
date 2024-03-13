package com.revisao.revisaojpa;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/revisao", "kaue", "root");

            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet rs = metaData.getTables(null, null, "%", new String[]{"TABLE"});

            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                System.out.println("Table: " + tableName);

                ResultSet columns = metaData.getColumns(null, null, tableName, null);
                Velocity.init(); // Inicializa o Velocity
                VelocityContext context = new VelocityContext();
                context.put("tableName", tableName);
                context.put("columns", columns);

                Template template = Velocity.getTemplate("templates/JavaClass.vm"); // Arquivo de modelo Velocity

                StringWriter stringWriter = new StringWriter();
                template.merge(context, stringWriter);

                String javaCode = stringWriter.toString();

                // Escreve o código Java em um arquivo
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(tableName + ".java"))) {
                    writer.write(javaCode);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
