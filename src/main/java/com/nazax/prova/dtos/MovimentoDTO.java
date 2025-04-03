package com.nazax.prova.dtos;

import com.nazax.prova.enums.Classificacao;

import java.time.LocalDateTime;

public class MovimentoDTO {

    private Long id;
    private LocalDateTime dataMovimento;
    private Double valor;
    private Classificacao classificacao;
    private String observacao;

    public MovimentoDTO(Long id, LocalDateTime dataMovimento, Double valor, Classificacao classificacao, String observacao) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDateTime dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
