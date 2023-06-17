package nashicodes;

import java.util.*;

public class Menu {

    public static void main(String[] args) {

        double memoria = 0;
        int operacao;
        do {
            System.out.println("Memória: " + memoria);
            operacao = lerOperacao();
            double valor;
            switch (operacao) {
                case 1 -> {
                    valor = lerDouble();
                    memoria = Operacoes.soma(memoria, valor);
                }
                case 2 -> {
                    valor = lerDouble();
                    memoria = Operacoes.subtracao(memoria, valor);
                }
                case 3 -> {
                    valor = lerDouble();
                    memoria = Operacoes.multiplicacao(memoria, valor);
                }
                case 4 -> {
                    valor = lerDouble();
                    try {
                        memoria = Operacoes.divisao(memoria, valor);
                    } catch (DivisaoZero e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> memoria = 0;
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Operação inválida!");
            }
            System.out.println();
        } while (operacao != 6);
    }

    public static double lerDouble() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor real:");
        double valor;
        try {
            valor = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido!");
            valor = lerDouble();
        }
        return valor;
    }

    public static int lerOperacao() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Limpar");
        System.out.println("6 - Sair");

        int operacao;
        try {
            operacao = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Operação inválida!");
            operacao = lerOperacao();
        }
        if (operacao < 1 || operacao > 6) {
            System.out.println("Intervalo inválido!");
            operacao = lerOperacao();
        }
        return operacao;
    }
}
