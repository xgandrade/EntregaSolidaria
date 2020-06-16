package com.example.entregasolidaria.Model;

import java.text.DecimalFormat;

public class Produto {

    private int IdProduto;
    private int IdMercado;
    private Double Preco;
    private String Descricao;
    private int Estoque;

    public Produto(int IdProduto, int IdMercado, Double Preco, String Descricao, int Estoque) {
        this.IdMercado = IdMercado;
        this.IdProduto = IdProduto;
        this.Preco = Preco;
        this.Descricao = Descricao;
        this.Estoque = Estoque;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int idProduto) {
        IdProduto = idProduto;
    }

    public int getIdMercado() {
        return IdMercado;
    }

    public void setIdMercado(int idMercado) {
        IdMercado = idMercado;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int estoque) {
        Estoque = estoque;
    }
}
