package com.seuprojeto.coletaseletiva.coletaseletiva.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PontoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;

    @JsonProperty("tipoResiduo")
    private String tipoResíduo;  // mantém o nome com acento internamente

    private Double latitude;
    private Double longitude;

    // Construtor vazio para JPA
    public PontoColeta() {
    }

    // Construtor com todos os campos
    public PontoColeta(String nome, String endereco, String tipoResíduo, Double latitude, Double longitude) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipoResíduo = tipoResíduo;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Construtor simplificado (opcional)
    public PontoColeta(String nome, Double latitude, Double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters e Setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoResíduo() {
        return tipoResíduo;
    }

    public void setTipoResíduo(String tipoResíduo) {
        this.tipoResíduo = tipoResíduo;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
