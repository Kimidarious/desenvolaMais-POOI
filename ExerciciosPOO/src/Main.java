import Desafio1.ProdutoEstoque;
import Exercicio2.Pedido;
import Exercicio2.Produto;
import Exercicio2.ItemPedido;
import Exercicio3.Aluno;
import Exercicio4.Livro;
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

                    System.out.println("========== TESTE DESAFIO 1 - CLASSE PRODUTO ==========\n");

                    // Testando construtor completo
                    System.out.println("=== Criando produto com estoque inicial ===");
                    ProdutoEstoque produtoEstoque1 = new ProdutoEstoque("Notebook Dell", 2500.00, 10);
                    produtoEstoque1.exibirResumo();

                    // Testando construtor sem estoque
                    System.out.println("\n=== Criando produto sem estoque inicial ===");
                    ProdutoEstoque produtoEstoque2 = new ProdutoEstoque("Mouse Gamer", 150.00);
                    produtoEstoque2.exibirResumo();

                    // Testando adição de estoque
                    System.out.println("\n=== Testando adição de estoque ===");
                    produtoEstoque2.adicionarEstoque(25);
                    produtoEstoque2.exibirResumo();

                    // Testando vendas
                    System.out.println("\n=== Testando vendas ===");
                    produtoEstoque1.vender(3); // Venda normal
                    produtoEstoque1.vender(15); // Tentativa de venda com estoque insuficiente
                    produtoEstoque1.vender(5); // Outra venda normal

                    // Estado final dos produtos
                    System.out.println("\n=== ESTADO FINAL DOS PRODUTOS ===");
                    produtoEstoque1.exibirResumo();
                    produtoEstoque2.exibirResumo();

                    // Testando validações
                    System.out.println("\n=== Testando validações ===");
                    produtoEstoque1.adicionarEstoque(-5); // Quantidade negativa
                    produtoEstoque1.vender(-2); // Quantidade negativa para venda
                    produtoEstoque2.setPreco(-100); // Preço negativo

                    System.out.println("\n========== TESTES CONCLUÍDOS ==========");

            System.out.println("========== TESTE EXERCÍCIO 3: CLASSE ALUNO ==========\n");

            // Testando construtor completo
            System.out.println("=== Criando aluno com todos os dados ===");
            Aluno aluno1 = new Aluno("João Silva", "2024001", "Engenharia de Software");
            aluno1.exibirDados();

            // Testando construtor sem matrícula
            System.out.println("\n=== Criando aluno apenas com nome e curso ===");
            Aluno aluno2 = new Aluno("Maria Santos", "Administração");
            aluno2.exibirDados();

            // Adicionando matrícula posteriormente
            System.out.println("=== Adicionando matrícula ao segundo aluno ===");
            aluno2.setMatricula("2024002");
            aluno2.exibirDados();

            // Testando toString
            System.out.println("=== Usando toString() ===");
            System.out.println("Aluno 1: " + aluno1);
            System.out.println("Aluno 2: " + aluno2);

            System.out.println("\n========== TESTE EXERCÍCIO 3: CLASSE LIVRO ==========\n");

            // Criando primeiro livro
            System.out.println("=== Criando primeiro livro ===");
            Livro livro1 = new Livro("1984", "George Orwell", 1949);
            livro1.exibirInformacoes();

            // Criando segundo livro
            System.out.println("=== Criando segundo livro ===");
            Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
            livro2.exibirInformacoes();

            // Testando getters
            System.out.println("=== Acessando dados via getters ===");
            System.out.printf("O livro '%s' foi escrito por %s em %d\n",
                    livro1.getTitulo(), livro1.getAutor(), livro1.getAnoPublicacao());
            System.out.printf("O livro '%s' foi escrito por %s em %d\n",
                    livro2.getTitulo(), livro2.getAutor(), livro2.getAnoPublicacao());

            // Testando toString
            System.out.println("\n=== Usando toString() ===");
            System.out.println("Livro 1: " + livro1);
            System.out.println("Livro 2: " + livro2);

            // Modificando dados via setters
            System.out.println("\n=== Modificando dados via setters ===");
            livro1.setTitulo("Nineteen Eighty-Four");
            System.out.println("Título alterado:");
            livro1.exibirInformacoes();

            System.out.println("\n========== TESTES CONCLUÍDOS ==========");
    }
}