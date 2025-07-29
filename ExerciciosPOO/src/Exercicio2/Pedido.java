package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private int numeroPedido;

    public Pedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido item = new ItemPedido(produto, quantidade);
        adicionarItem(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.calcularSubTotal();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("\n=== PEDIDO #" + numeroPedido + " ===\n");
        for (ItemPedido item : itens){
            System.out.println(item);
        }
        System.out.printf("Total: R$ %.2f\n", calcularTotal());
        System.out.println("=========================");
    }

    public List <ItemPedido> getItens() {
        return new ArrayList<>(itens);
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
}
