package com.nazax.prova.enums;

public enum Classificacao {

    CLASSIFICACAO("Entrada", "Saida");

    private final String entrada;

    private final String saida;

    Classificacao(String entrada, String saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSaida() {
        return saida;
    }

    public static Classificacao obterPorSaida(String entrada) {
        for (Classificacao classificacao : Classificacao.values()) {
            if (classificacao.getSaida().equals(entrada)) {
                return classificacao;
            }
        }
        return null;
    }

    public static Classificacao obterPorEntrada(String entrada) {
        for (Classificacao classificacao : Classificacao.values()) {
            if (classificacao.getEntrada().equals(entrada)) {
                return classificacao;
            }
        }
        return null;
    }
}
