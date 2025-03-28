package com.tarefas.Tarefas.Model;

public enum SituacaoTarefa {
    Pendente(0),
    Andamento(1),
    Concluída(2);

    private final int valor;

    SituacaoTarefa(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static SituacaoTarefa fromValor(int valor) {
        for (SituacaoTarefa situacao : values()) {
            if (situacao.getValor() == valor) {
                return situacao;
            }
        }
        throw new IllegalArgumentException("Valor inválido para SituacaoTarefa: " + valor);
    }
}
