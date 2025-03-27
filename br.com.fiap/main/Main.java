package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar novoCalculo = new DespesaFamiliar();
        Scanner scan = new Scanner(System.in);
        String resposta;

        try {
            System.out.println("Digite o total que a família recebe no mês: ");
            novoCalculo.rendaFamiliar = scan.nextDouble();
            System.out.println("Digite o número de moradores da casa: ");
            novoCalculo.numeroDeMoradores = scan.nextInt();
            System.out.println("Digite o gasto com luz: ");
            novoCalculo.gastoComLuz = scan.nextDouble();
            System.out.println("Digite o gasto com internet: ");
            novoCalculo.gastoComInternet = scan.nextDouble();
            System.out.println("Digite o valor da mensalidade da academia por pessoa: ");
            novoCalculo.valorMensalidadeDaAcademia = scan.nextDouble();
            System.out.println(novoCalculo.valorMensalidadeDaAcademia);
            System.out.printf(
                    "Dados Recebidos:\nRenda da Familia Bruta: %.3f\nNúmero de moradores da casa: %d\nGasto mensal da casa com luz: %f.3f\nGasto mensal da casa com internet: %f.3f\nGasto mensal da casa com academia: %f.3f\n Total em gastos mensais: %f.3f\nRenda Familiar Líquida: %f.3f",
                    novoCalculo.rendaFamiliar, novoCalculo.numeroDeMoradores, novoCalculo.gastoComLuz,
                    novoCalculo.gastoComInternet, novoCalculo.valorMensalidadeDaAcademia,
                    novoCalculo.calcularTotalDeDespesas(), novoCalculo.calcularRendaFamiliarLiquida());
        } catch (Exception e) {
            System.out.println("Caractér inválido");
        }
    }
}