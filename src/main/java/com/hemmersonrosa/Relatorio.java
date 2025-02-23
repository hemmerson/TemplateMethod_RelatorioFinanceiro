package com.hemmersonrosa;

abstract class Relatorio {

    public final void gerarRelatorio() {
        coletarDados();
        processarDados();
        exibirDetalhes();
        finalizarRelatorio();
    }

    protected abstract void coletarDados();
    protected abstract void exibirDetalhes();

    private void processarDados() {
        System.out.println("Processando dados...");
    }

    private void finalizarRelatorio() {
        System.out.println("Relatorio Finalizado.");
    }
}
