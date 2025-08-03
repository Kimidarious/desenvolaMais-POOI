package Desafio4;

public class Conta {
    private String titular;
    private String numero;
    private double saldo;
    private static final double TAXA_OPERACAO = 0.50;

    public Conta(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido para depósito");
            return false;
        }

        if (saldo <= TAXA_OPERACAO){
            System.out.println("Saldo insuficiente para pagar a taxa de operação (R$ " +
                    String.format("%.2f", TAXA_OPERACAO) + ")");
            return false;
        }

        saldo += valor - TAXA_OPERACAO;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Valor depositado: R$ " + String.format("%.2f", valor));
        System.out.println("Taxa cobrada: R$ " + String.format("%.2f", TAXA_OPERACAO));
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0){
            System.out.println("Valor inválido para saque!");
            return false;
        }

        double valorTotal = valor + TAXA_OPERACAO;

        if (saldo < valorTotal){
            System.out.println("Saldo insuficiente!");
            System.out.println("Valor solicitado: R$ " + String.format("%.2f", valor));
            System.out.println("Taxa de Operação: R$ " + String.format("%.2f", TAXA_OPERACAO));
            System.out.println("Total necessário: R$ " + String.format("%.2f", valorTotal));
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
            return false;
        }

        saldo -= valorTotal;
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Valor sacado: R$ " + String.format("%.2f", valor));
        System.out.println("Taxa cobrada: R$ " + String.format("%.2f", TAXA_OPERACAO));
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (valor <= 0){
            System.out.println("Valor inválido para transferência!");
            return false;
        }

        double valorTotal = valor + TAXA_OPERACAO;

        if (saldo < valorTotal){
            System.out.println("Saldo insuficiente para transferência!");
            System.out.println("Valor a transferir: R$ " + String.format("%.2f", valor));
            System.out.println("Taxa de Operação: R$ " + String.format("%.2f", TAXA_OPERACAO));
            System.out.println("Total necessário: R$ " + String.format("%.2f", valorTotal));
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
            return false;
        }

        saldo -= valorTotal;
        contaDestino.saldo += valor;

        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Valor transferido: R$ " + String.format("%.2f", valor));
        System.out.println("Para: " + contaDestino.getTitular() + " (Conta: " + contaDestino.getNumero() + ")" );
        System.out.println("Taxa cobrada: R$ " + String.format("%.2f", TAXA_OPERACAO));
        return true;
    }

    public boolean pagar(double valor, String descricao){
        if (saldo <= 0){
            System.out.println("Valor inválido para pagamento!");
            return false;
        }

        double valorTotal = valor + TAXA_OPERACAO;

        if (saldo < valorTotal){
            System.out.println("Saldo insuficiente para pagamento!");
            System.out.println("valor do pagamento: R$ " + String.format("%.2f", valor));
            System.out.println("Taxa de operação: R$ " + String.format("%.2f", TAXA_OPERACAO));
            System.out.println("Total necessário: R$ " + String.format("%.2f", valorTotal));
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
            return false;
        }

        saldo -= valorTotal;
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Pago: R$ " + String.format("%.2f", valor));
        System.out.println("Taxa cobrada: R$ " + String.format("%.2f", TAXA_OPERACAO));
        return true;
    }

    public void mostrarSaldo(){
        System.out.println("==========================================");
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
        System.out.println("==========================================");

    }
}
