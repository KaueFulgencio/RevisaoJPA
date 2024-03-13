/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.revisao.revisaojpa.Model;

/**
 *
 * @author KaueM
 */
public class Predio {
    private int codigo;
    private String descricao;
    private Endereco endereco;
    private Bairro bairro;
    private Cidade cidade;
    private String numero;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Predio(int codigo, String descricao, Endereco endereco, Bairro bairro, Cidade cidade, String numero) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Predio{" + "codigo=" + codigo + ", descricao=" + descricao + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", numero=" + numero + '}';
    }
    
    
}
