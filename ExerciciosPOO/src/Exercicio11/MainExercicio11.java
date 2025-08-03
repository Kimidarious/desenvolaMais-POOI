package Exercicio11;

public class MainExercicio11 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Eliakim Simões", 1000.0);

        System.out.println("=== INFORMAÇÕES INICIAIS ===");
        conta.exibirInformacoes();

        System.out.println("=== OPERAÇÕES DE SAQUE ===");

        double valorSaque1 = 300.0;
        boolean sucesso1 = conta.sacar(valorSaque1);

        if (sucesso1) {
            System.out.println("✓ Saque de R$ " + valorSaque1 + " realizado com sucesso!");
        } else {
            System.out.println("x Falha no saque de R$ " + valorSaque1 + "!");
        }

        System.out.println("Saldo após a primeira tentativa de saque: R$ " + conta.getSaldo());

        double valorSaque2 = 800.0;
        boolean sucesso2 = conta.sacar(valorSaque2);

        if (sucesso2){
            System.out.println("✓ Saque de R$ " + valorSaque2 + " realizado com sucesso!");
        } else {
            System.out.println("x Falha no saque de R$ " + valorSaque2 + "!");
        }

        System.out.println("Saldo após a segunda tentativa de saque: R$ " + conta.getSaldo());

        double valorSaque3 = 200.0;
        boolean sucesso3 = conta.sacar(valorSaque3);

        if (sucesso3){
            System.out.println("✓ Saque de R$ " + valorSaque3 + " realizado com sucesso!");
        } else {
            System.out.println("x Falha no saque de R$ " + valorSaque3 + "- saldo insuficiente!");
        }

        System.out.println("\n=== SALDO FINAL ===");
        conta.exibirInformacoes();
    }
}
