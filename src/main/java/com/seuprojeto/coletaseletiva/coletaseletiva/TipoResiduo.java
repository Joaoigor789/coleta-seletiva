package com.seuprojeto.coletaseletiva.coletaseletiva;

import jakarta.persistence.*;


@Entity
public class TipoResiduo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer quantidade;  // Novo campo

    public TipoResiduo(String nome) {
        this.nome = nome;
        this.quantidade = 0;  // pode iniciar quantidade com zero
    }


    public TipoResiduo(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // construtor padrão (SEM parâmetros) — obrigatório para JPA
    public TipoResiduo() {
    }

    // getters e setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
