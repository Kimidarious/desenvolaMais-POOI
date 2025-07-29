package exercicio1;

public class ContaEspecial extends ContaBancaria {
    public ContaEspecial(String numero, double saldoInicial, double limite){
        super(numero, saldoInicial, limite);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0){
            System.out.println("Valor inválido para saque!");
            return false;
        }
        double saldoDisponivel = saldo + limite;

        if (valor <= saldoDisponivel){
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
            return true;
        }else {
            System.out.printf("Limite excedido! R$ %.2f\n", saldoDisponivel);
            return false;
        }
    }
}
