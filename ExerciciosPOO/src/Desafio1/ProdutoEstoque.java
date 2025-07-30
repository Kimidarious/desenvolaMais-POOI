package Desafio1;

public class ProdutoEstoque {
    private String nome;
    private double preco;
    private int estoque;

    public ProdutoEstoque(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public ProdutoEstoque(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.printf("Adicionados %d unidades ao estoque. Estoque atual: %d\n", + quantidade, this.estoque);
        } else {
            System.out.println("Quantidade deve ser positiva!\n");
        }
    }

    public boolean vender(int quantidade) {
        if (quantidade <= 0){
            System.out.println("Quantidade para venda deve ser positiva!");
            return false;
        }

        if (quantidade <= this.estoque){
            this.estoque -= quantidade;
            double valorVenda = quantidade * this.preco;
            System.out.printf("Venda realizada: %d unidades de %s por R$ %.2f\n", quantidade, this.nome, valorVenda);
            System.out.printf("Estoque restante: %d unidades\n", this.estoque);
            return true;
        } else {
            System.out.printf("Estoque insuficiente! Disponível: %d, Solicitado: %d\n", this.estoque, quantidade);
            return false;
        }
    }
    public void exibirResumo(){
        System.out.println("=== RESUMO DO PRODUTO ===");
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.printf("Estoque: %d unidades\n", this.estoque);
        System.out.printf("Valor total em estoque: R$ %.2f\n", this.estoque * this.preco);
        System.out.println("=========================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo!");
        }
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
            return String.format("Produto{nome='%s', preco=R$%.2f, estoque=%d}", nome, preco, estoque);
    }
}
