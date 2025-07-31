import Exercicio6.CaixaDeCompras;

public class MainExercicio6 {
    public static void main(String[] args) {
        CaixaDeCompras caixa = new CaixaDeCompras();

        System.out.println("=== TESTE 1: TOTAL MENOR QUE 100 REAIS (SEM DESCONTO) ===");
        double total1 = caixa.calcularTotalComDesconto(30.0, 25.0, 20.0);
        caixa.exibirDetalhesCompra(30.0, 25.0, 20.0);

        System.out.println("=== TESTE 2: TOTAL IGUAL A 100 REAIS (SEM DESCONTO) ===");
        double total2 = caixa.calcularTotalComDesconto(40.0, 35.0, 25.0);
        caixa.exibirDetalhesCompra(40.0, 35.0, 25.0);

        System.out.println("=== TESTE 3: TOTAL MAIOR QUE 100 REAIS (SEM DESCONTO) ===");
        double total3 = caixa.calcularTotalComDesconto(50.0, 40.0, 35.0);
        caixa.exibirDetalhesCompra(50.0, 40.0, 35.0);

        System.out.println("=== TESTE ADICIONAL: COMPRA DE ALTO VALOR ===");
        double total4 = caixa.calcularTotalComDesconto(150.0, 200.0, 100.0);
        caixa.exibirDetalhesCompra(150.0, 200.0, 100.0);

    }
}
