package com.hemmersonrosa;

public class RelatorioVendas extends Relatorio{

    @Override
    protected void coletarDados() {
        System.out.println("Coletando dados de Vendas...");
    }

    @Override
    protected void exibirDetalhes() {
        System.out.println("Exibindo total de Vendas e produtos mais vendidos.");
    }
}
