package com.nazax.prova.models;

import com.nazax.prova.enums.Classificacao;
import jakarta.persistence.*;

@Entity
@Table(name = "movimento")
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data_movimento;

    private String valor;

    @Enumerated(EnumType.STRING)
    private Classificacao classificacao;

    public Movimento() {

    }

    public Movimento(Long id, String data_movimento, String valor, Classificacao classificacao) {
        this.id = id;
        this.data_movimento = data_movimento;
        this.valor = valor;
        this.classificacao = classificacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_movimento() {
        return data_movimento;
    }

    public void setData_movimento(String data_movimento) {
        this.data_movimento = data_movimento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}
