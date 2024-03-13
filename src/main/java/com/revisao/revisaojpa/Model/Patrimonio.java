/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.revisao.revisaojpa.Model;

import java.math.BigDecimal;
import java.util.Date;
/**
 *
 * @author KaueM
 */
public class Patrimonio {
    private int codigo;
    private String descricao;
    private Tipo tipo;
    private Date dataFabricacao;
    private Date dataAquisicao;
    private Date dataEliminacao;
    private BigDecimal valorAquisicao;
    private String observacao;
    private String localizacao;
    private Marca marca;
    private Departamento departamento;
    private Predio predio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataEliminacao() {
        return dataEliminacao;
    }

    public void setDataEliminacao(Date dataEliminacao) {
        this.dataEliminacao = dataEliminacao;
    }

    public BigDecimal getValorAquisicao() {
        return valorAquisicao;
    }

    public void setValorAquisicao(BigDecimal valorAquisicao) {
        this.valorAquisicao = valorAquisicao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public Patrimonio(int codigo, String descricao, Tipo tipo, Date dataFabricacao, Date dataAquisicao, Date dataEliminacao, BigDecimal valorAquisicao, String observacao, String localizacao, Marca marca, Departamento departamento, Predio predio) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataFabricacao = dataFabricacao;
        this.dataAquisicao = dataAquisicao;
        this.dataEliminacao = dataEliminacao;
        this.valorAquisicao = valorAquisicao;
        this.observacao = observacao;
        this.localizacao = localizacao;
        this.marca = marca;
        this.departamento = departamento;
        this.predio = predio;
    }

    @Override
    public String toString() {
        return "Patrimonio{" + "codigo=" + codigo + ", descricao=" + descricao + ", tipo=" + tipo + ", dataFabricacao=" + dataFabricacao + ", dataAquisicao=" + dataAquisicao + ", dataEliminacao=" + dataEliminacao + ", valorAquisicao=" + valorAquisicao + ", observacao=" + observacao + ", localizacao=" + localizacao + ", marca=" + marca + ", departamento=" + departamento + ", predio=" + predio + '}';
    }
    
    
}
