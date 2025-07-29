import Exercicio2.ItemPedido;
import Exercicio2.Pedido;
import Exercicio2.Produto;
import exercicio1.ContaBancaria;
import exercicio1.ContaEspecial;

public class Main {
    public static void main(String[] args) {
            System.out.println("========== TESTE EXERCÍCIO 1: BANCO DE CONTAS ==========\n");

            // Criando contas
            ContaBancaria contaNormal = new ContaBancaria("12345-6", 1000.0, 500.0);
            ContaEspecial contaEspecial = new ContaEspecial("98765-4", 500.0, 1000.0);

            System.out.println("=== SITUAÇÃO INICIAL ===");
            contaNormal.exibirInfo();
            contaEspecial.exibirInfo();

            System.out.println("\n=== TESTANDO CONTA NORMAL ===");
            contaNormal.depositar(200.0);
            contaNormal.sacar(500.0);
            contaNormal.sacar(800.0); // Deve falhar - saldo insuficiente
            System.out.printf("Saldo atual: R$ %.2f\n", contaNormal.consultarSaldo());

            System.out.println("\n=== TESTANDO CONTA ESPECIAL ===");
            contaEspecial.depositar(100.0);
            contaEspecial.sacar(800.0); // Usa o limite
            contaEspecial.sacar(900.0); // Deve falhar - excede limite
            System.out.printf("Saldo atual: R$ %.2f\n", contaEspecial.consultarSaldo());

            System.out.println("\n=== SITUAÇÃO FINAL ===");
            contaNormal.exibirInfo();
            contaEspecial.exibirInfo();

            System.out.println("\n\n========== TESTE EXERCÍCIO 2: LOJA VIRTUAL ==========\n");

            // Criando produtos
            Produto notebook = new Produto("Notebook Dell", 2500.00);
            Produto mouse = new Produto("Mouse Gamer", 150.00);
            Produto teclado = new Produto("Teclado Mecânico", 300.00);

            System.out.println("=== PRODUTOS DISPONÍVEIS ===");
            System.out.println(notebook);
            System.out.println(mouse);
            System.out.println(teclado);

            // Criando pedido
            Pedido pedido = new Pedido(1001);

            System.out.println("\n=== ADICIONANDO ITENS AO PEDIDO ===");
            pedido.adicionarItem(notebook, 1);
            pedido.adicionarItem(mouse, 2);
            pedido.adicionarItem(teclado, 1);

            // Exibindo pedido final
            pedido.exibirPedido();

            System.out.println("\n=== CRIANDO SEGUNDO PEDIDO ===");
            Pedido pedido2 = new Pedido(1002);
            pedido2.adicionarItem(new ItemPedido(mouse, 5));
            pedido2.adicionarItem(new ItemPedido(teclado, 2));
            pedido2.exibirPedido();

            System.out.println("\n========== TESTES CONCLUÍDOS ==========");
    }
}