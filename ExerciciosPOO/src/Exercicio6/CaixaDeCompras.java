package Exercicio6;

public class CaixaDeCompras {
    public double calcularTotalComDesconto(double valor1, double valor2, double valor3){
        double total = valor1 + valor2 + valor3;
        if (total > 100.0){
            total -= total * 0.90;
        }
        return total;
    }

    public void exibirDetalhesCompra(double valor1, double valor2, double valor3){
        double totalSemDesconto = valor1 + valor2 + valor3;
        double totalComDesconto = calcularTotalComDesconto(valor1, valor2, valor3);

        System.out.printf("Valores: R$ %.2f + R$ %.2f + R$ %.2f = R$ %.2f\n",
                            valor1, valor2, valor3, totalSemDesconto);

        if (totalSemDesconto > 100.0){
            System.out.printf("Desconto aplicado (10%%): R$ %.2f\n",
                                totalSemDesconto - totalComDesconto);
            System.out.printf("Total final: R$ %.2f\n", totalComDesconto);
        } else {
            System.out.printf("Total final sem desconto: R$ %.2f\n", totalComDesconto);
        }
    }
}
