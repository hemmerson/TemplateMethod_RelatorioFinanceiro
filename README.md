# 📊 Template Method - Relatórios Financeiros

Este repositório contém uma implementação do **padrão de projeto Template Method** aplicada à geração de relatórios financeiros. O objetivo é estruturar um fluxo fixo de criação de relatórios, permitindo a adição de novos tipos sem modificar o código existente.

---

## 📌 Descrição do Problema

A empresa precisa gerar relatórios financeiros mensais de diferentes tipos:

- **Relatório de Vendas**: Mostra o total de vendas e os produtos mais vendidos.
- **Relatório de Despesas**: Mostra o total de despesas e os maiores gastos da empresa.

Apesar das diferenças, todos os relatórios seguem uma estrutura fixa:

1. **Coletar dados** (diferente para cada relatório);
2. **Processar dados** (comum para todos);
3. **Exibir detalhes** (diferente para cada relatório);
4. **Finalizar o relatório** (comum para todos).

---

## 🔨 Padrão Utilizado: Template Method

O **Template Method** permite definir um **fluxo fixo** para a geração de relatórios, delegando os detalhes específicos para subclasses.

### **Diagrama UML da Solução**
```
Relatorio (abstract class)
│
├──> RelatorioVendas (subclass)
└──> RelatorioDespesas (subclass)
```

- `RelatorioFinanceiro` (classe abstrata) contém o método **gerarRelatorio()**, que define o fluxo fixo.
- `RelatorioVendas` e `RelatorioDespesas` implementam as partes específicas de cada relatório.

---

## 🚀 Tecnologias Utilizadas

- **Java**
- **Paradigma Orientado a Objetos (POO)**
- **Padrões de Projeto (Template Method)**

---

## 📂 Estrutura do Código

```
📦 src
 ┣ 📜 Relatorio.java (Classe abstrata - Template Method)
 ┣ 📜 RelatorioVendas.java (Implementação específica)
 ┣ 📜 RelatorioDespesas.java (Implementação específica)
 ┗ 📜 Main.java (Classe de teste)
```
---

## 📌 Saída Esperada

```sh
=== Gerando Relatório de Vendas ===
Coletando dados de vendas...
Processando dados...
Exibindo total de vendas e produtos mais vendidos.
Relatório finalizado.

=== Gerando Relatório de Despesas ===
Coletando dados de despesas...
Processando dados...
Exibindo total de despesas e maiores gastos da empresa.
Relatório finalizado.
```

---

## 🎯 Benefícios do Template Method nesta solução

✅ Evita duplicação de código, mantendo um fluxo padronizado.  
✅ Permite adicionar novos relatórios sem modificar o código existente (**princípio OCP - SOLID**).  
✅ Facilita a manutenção e reutilização do código.

---

## 📌 Autor

✍️ Desenvolvido por Hemmerson Luis Barros da Rosa(https://github.com/hemmerson).

Sinta-se à vontade para contribuir ou sugerir melhorias! 🚀  

