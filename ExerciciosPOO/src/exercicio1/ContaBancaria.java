package exercicio1;

public class ContaBancaria {

    protected String numero;
    protected double saldo;
    protected double limite;

    public ContaBancaria(String numero, double saldoInicial, double limite){
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public boolean sacar(double valor){
        if(valor <= 0){
            System.out.printf("Valor inválido para sacar");
            return false;
        }

        if (valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
            return true;
        } else {
            System.out.printf("Saldo insuficiente para sacar R$ %.2f\n", valor);
            return false;
        }
    }

    public void depositar(double valor){
        if (valor <= 0) {
            System.out.printf("Valor inválido para deposito!");
            return;
        }
        saldo += valor;
        System.out.printf("Deposito de R$ %.2f realizado com sucesso!\n", valor);
    }

    public double consultarSaldo(){
        return saldo;
    }

    public String getNumero(){
        return numero;
    }

    public double getLimite(){
        return limite;
    }

    public void exibirInfo(){
        System.out.printf("Conta: %s | Saldo: R$ %.2f | Limite: R$ %.2f\n", numero, saldo, limite);
    }
}
