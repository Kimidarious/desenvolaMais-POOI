package Exercicio9;

public class MainExercicio9 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Eliakim", 100.0);

        System.out.println("=== DEMONSTRAÇÃO DO MÉTODO RENDER JUROS ===");
        System.out.println("Títular: " + conta.getTitular());
        conta.consultarSaldo();

        System.out.println("\nAplicando juros de 10% ao saldo da conta...");
        conta.renderJuros(0.1);

        System.out.println("\nAplicando juros de 5% ao saldo da conta: ");
        conta.renderJuros(0.05);

        System.out.println("\nAplicando juros de 2,5% ao saldo da conta: ");
        conta.renderJuros(0.025);

        System.out.println("=== OUTROS EXEMPLOS ===");

        ContaBancaria conta2 = new ContaBancaria("Rapha Rodrigues", 1000.0);
        System.out.println("\nConta 2 - Títular: " + conta2.getTitular());
        conta2.consultarSaldo();
        System.out.println("\nAplicando juros de 3% ao saldo da conta...");
        conta2.renderJuros(0.03);

        ContaBancaria conta3 = new ContaBancaria("Alison Rodrigo", 500.0);
        System.out.println("\nConta 3 - Títular: " + conta3.getTitular());
        conta3.consultarSaldo();
        System.out.println("\nAplicando juros de 15% ao saldo da conta...");
        conta3.renderJuros(0.15);
    }
}
