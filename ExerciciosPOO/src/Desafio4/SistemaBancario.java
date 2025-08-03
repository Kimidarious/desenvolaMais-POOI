package Desafio4;

import java.util.Scanner;

public class SistemaBancario {
    private static Scanner scanner = new Scanner(System.in);
    private static Conta conta;
    private static Conta contaDestino;

    public static void main(String[] args) {
        inicializarSistema();

        int opcao;

        do {
            mostrarMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    operacaoDeposito();
                    break;
                case 2:
                    operacaoSaque();
                    break;
                case 3:
                    operacaoTransferencia();
                    break;
                case 4:
                    operacaoPagamento();
                    break;
                case 5:
                    System.out.println("Obrigado por usar nosso sistema bancário!");
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente.");
            }

            if (opcao != 5) {
                conta.mostrarSaldo();
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (opcao != 5);
        scanner.close();
    }

    private static void inicializarSistema() {
        System.out.println("=== SUSTEMA BANCÁRIO===");
        System.out.println("Bem-vindo ao Sistema de Movimentação Bancária");
        System.out.println();

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        String numero = scanner.nextLine();

        System.out.println("Digite o saldo inicial da conta: R$ ");
        double saldoInicial = lerValor();

        conta = new Conta(titular, numero, saldoInicial);

        contaDestino = new Conta("Eliakim Simões", "12345-9", 1000.00);

        System.out.println("\nConta criada com sucesso!");
        conta.mostrarSaldo();

        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void mostrarMenu() {
        System.out.println("=== MENU DE OPERAÇÕES ===");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Transferir");
        System.out.println("4. Pagar");
        System.out.println("5. Sair");
        System.out.println("==============================");
        System.out.println("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static double lerValor() {
        while (true){
            try {
                String input = scanner.nextLine().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite novamente: ");
            }
        }
    }

    private static void operacaoDeposito() {
        System.out.println("=== DEPÓSITO ===");
        System.out.println("Digite o valor a ser depositado: R$ ");
        double valor = lerValor();

        conta.depositar(valor);
    }

    private static void operacaoSaque() {
        System.out.println("=== SAQUE ===");
        System.out.println("Digite o valor a ser sacado: R$ ");
        double valor = lerValor();

        conta.sacar(valor);
    }

    private static void operacaoTransferencia() {
        System.out.println("\n=== TRANSFERÊNCIA ===");
        System.out.println("Conta destino disponível:");
        System.out.println("Titular: " + contaDestino.getTitular());
        System.out.println("Conta: " + contaDestino.getNumero());
        System.out.println();

        System.out.println("Digite o valor a ser transferido: R$ ");
        double valor = lerValor();

        conta.transferir(valor, contaDestino);
    }

    private static void operacaoPagamento() {
        System.out.println("\n=== PAGAMENTO ===");
        System.out.println("Descrição do Pagamento: ");
        String descricao = scanner.nextLine();

        System.out.println("Digite o valor a pagar: R$ ");
        double valor = lerValor();

        conta.pagar(valor, descricao);
    }
}
