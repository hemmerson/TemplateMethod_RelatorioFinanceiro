package com.hemmersonrosa;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Gerando Relatório de Vendas ===");
        Relatorio relatorioVendas = new RelatorioVendas();
        relatorioVendas.gerarRelatorio();

        System.out.println("\n=== Gerando Relatório de Despesas ===");
        Relatorio relatorioDespesas = new RelatorioDespesas();
        relatorioDespesas.gerarRelatorio();
    }
}