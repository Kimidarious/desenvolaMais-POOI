package Exercicio9;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria() {
        this.saldo = 0.0;
        this.titular = "";
    }

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public  void renderJuros(double taxa){
        double juros = this.saldo * taxa;
        this.saldo += juros;

        System.out.println("Juros aplicados: R$ " + String.format("%.2f", juros));
        System.out.println("Novo saldo: R$ " + String.format("%.2f", this.saldo));
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado: R$ " + String.format("%.2f", valor));
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado: R$ " + String.format("%.2f", valor));
            return true;
        }
        System.out.println("Saldo insuficiente para sacar o valor solicitado!");
        return false;
    }

    public void consultarSaldo(){
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", this.saldo));
    }
}
