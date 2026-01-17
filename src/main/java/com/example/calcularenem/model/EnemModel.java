package com.example.calcularenem.model;

public class EnemModel {
    private Double linguagens;
    private Double humanas;
    private Double natureza;
    private Double matematica;
    private Double redacao;

    // Getters e Setters (Necessários para o Spring ler o formulário)
    public Double getLinguagens() { return linguagens; }
    public void setLinguagens(Double linguagens) { this.linguagens = linguagens; }

    public Double getHumanas() { return humanas; }
    public void setHumanas(Double humanas) { this.humanas = humanas; }

    public Double getNatureza() { return natureza; }
    public void setNatureza(Double natureza) { this.natureza = natureza; }

    public Double getMatematica() { return matematica; }
    public void setMatematica(Double matematica) { this.matematica = matematica; }

    public Double getRedacao() { return redacao; }
    public void setRedacao(Double redacao) { this.redacao = redacao; }

    public Double calcularMediaPonderada() {
        return (linguagens + humanas + natureza + matematica + redacao) / 5;
    }
    
  }