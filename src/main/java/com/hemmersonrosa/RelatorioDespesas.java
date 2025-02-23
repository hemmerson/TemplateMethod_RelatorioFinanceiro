package com.hemmersonrosa;

public class RelatorioDespesas extends Relatorio {
    @Override
    protected void coletarDados() {
        System.out.println("Coletando dados de despesas...");
    }

    @Override
    protected void exibirDetalhes() {
        System.out.println("Exibindo total de despesas e maiores gastos da empresa.");
    }
}
