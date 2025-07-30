import Desafio1.Produto;

public class Main {
    public static void main(String[] args) {
                    System.out.println("========== TESTE DA CLASSE PRODUTO ==========\n");

                    // Testando construtor completo
                    System.out.println("=== Criando produto com estoque inicial ===");
                    Produto produto1 = new Produto("Notebook Dell", 2500.00, 10);
                    produto1.exibirResumo();

                    // Testando construtor sem estoque
                    System.out.println("\n=== Criando produto sem estoque inicial ===");
                    Produto produto2 = new Produto("Mouse Gamer", 150.00);
                    produto2.exibirResumo();

                    // Testando adição de estoque
                    System.out.println("\n=== Testando adição de estoque ===");
                    produto2.adicionarEstoque(25);
                    produto2.exibirResumo();

                    // Testando vendas
                    System.out.println("\n=== Testando vendas ===");
                    produto1.vender(3); // Venda normal
                    produto1.vender(15); // Tentativa de venda com estoque insuficiente
                    produto1.vender(5); // Outra venda normal

                    // Estado final dos produtos
                    System.out.println("\n=== ESTADO FINAL DOS PRODUTOS ===");
                    produto1.exibirResumo();
                    produto2.exibirResumo();

                    // Testando validações
                    System.out.println("\n=== Testando validações ===");
                    produto1.adicionarEstoque(-5); // Quantidade negativa
                    produto1.vender(-2); // Quantidade negativa para venda
                    produto2.setPreco(-100); // Preço negativo

                    System.out.println("\n========== TESTES CONCLUÍDOS ==========");
    }
}