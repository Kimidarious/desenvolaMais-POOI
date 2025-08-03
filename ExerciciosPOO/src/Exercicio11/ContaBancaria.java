package Exercicio11;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
      if (valor > 0) {
          saldo += valor;
          System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
      } else {
          System.out.println("Valor do depósito deve ser positivo");
      }
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
    return false;
    }

    public void exibirInformacoes(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
