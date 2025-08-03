package Exercicio10;

public class MainExercicio10 {
    public static void main(String[] args) {
        try {
            Cliente cliente1 = new Cliente();
            cliente1.setNome("Iza Simões");
            cliente1.setCpf("12365478998");
            cliente1.setIdade(25);

            System.out.println("Cliente criado com sucesso:");
            System.out.println(cliente1);

            Cliente cliente2 = new Cliente("Danilo Santos", "987.654.321-00", 30);
            System.out.println("\nSegundo cliente:");
            System.out.println(cliente2);

        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("=== TESTANDO VALIDAÇÕES ===");

        try {
            Cliente clienteInvalido = new Cliente();
            clienteInvalido.setCpf("12345678900");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro CPF: " + e.getMessage());
        }

        try {
            Cliente clienteInvalido = new Cliente();
            clienteInvalido.setIdade(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Idade: " + e.getMessage());
        }
    }
}
