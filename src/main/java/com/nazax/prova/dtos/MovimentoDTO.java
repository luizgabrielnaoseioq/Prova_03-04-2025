package com.nazax.prova.dtos;

import com.nazax.prova.enums.Classificacao;

public class MovimentoDTO {

    private Long id;

    private String data_movimento;

    private String valor;

    private Classificacao classificacao;

    public void setId(Long id) {
        this.id = id;
    }

    public void setData_movimento(String data_movimento) {
        this.data_movimento = data_movimento;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Long getId() {
        return id;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public String getValor() {
        return valor;
    }

    public String getData_movimento() {
        return data_movimento;
    }
}
