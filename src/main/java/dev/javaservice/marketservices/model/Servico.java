package com.marketservices.model;

import jakarta.persistence.*;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String funcao;
    private String descricao;
    private String nome;
    private Double preco;

    public Servico() {}

    public Servico(Long id, String funcao, String descricao, String nome, Double preco) {
        this.id = id;
        this.funcao = funcao;
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}

