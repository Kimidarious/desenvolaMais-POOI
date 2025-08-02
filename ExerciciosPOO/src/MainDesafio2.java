
import Desafio2.Reembolso;


public class MainDesafio2 {
    public static void main(String[] args) {
            System.out.println("=== SISTEMA DE REEMBOLSO DE DESPESAS===\n");

            Reembolso funcionario1 = new Reembolso("Carla", 5);
            Reembolso funcionario2 = new Reembolso("João", 10);
            Reembolso funcionario3 = new Reembolso("Maria", 3);

            System.out.println("--- TESTE 1: Funcionário com 5 dias de trabalho ---");
            double reembolso1 = funcionario1.calcularReembolso(150.0, 80.0, 200);
            funcionario1.imprimirResumoReembolso(reembolso1);
            System.out.println("Detalhes: Alimentação: R$ 150,00 | Transporte: R$ 80,00 | Hospedagem: R$ 200,00\n");


            System.out.println("--- TESTE 2: Funcionário com 7 dias de trabalho ---");
            double reembolso2 = funcionario2.calcularReembolso(200.0, 120.0, 300);
            funcionario2.imprimirResumoReembolso(reembolso2);
            System.out.println("Detalhes: Alimentação: R$ 200,00 | Transporte: R$ 120,00 | Hospedagem: R$ 300,00\n");
            System.out.printf("Valor antes do bônus: R$ %.2f | Valor após o bônus(10%%): R$ %.2f%n%n",
                    (200.0 + 120.0 + 300.0), reembolso2);

            System.out.println("--- TESTE 3: Funcionário sem hospedagem (método sobrecarregado ---");
            double reembolso3 = funcionario3.calcularReembolso(100.0, 60.0);
            funcionario3.imprimirResumoReembolso(reembolso3);
            System.out.println("Detalhes: Alimentação: R$ 100,00 | Transporte: R$ 60,00 | Hospedagem: R$ 0,00\n");


            System.out.println("--- TESTE 4: Funcionário com 10 dias sem hospedagem (bônus + sobrecarga) ---");
            double reembolso4 = funcionario2.calcularReembolso(180.0, 90.0);
            funcionario2.imprimirResumoReembolso(reembolso4);
            System.out.println("Detalhes: Alimentação: R$ 180,00 | Transporte: R$ 90,00 | Hospedagem: R$ 0,00\n");
            System.out.printf("Valor antes do bônus: R$ %.2f | Valor após o bônus(10%%): R$ %.2f%n%n",
                    (180.0 + 90.0), reembolso4);

            System.out.println("=== RESUMO DOS TESTES ===");
            System.out.println("✓ Método calcularReembolso(alimentacao, transporte, hospedagem) - testado");
            System.out.println("✓ Método calcularReembolso(alimentacao, transporte) - sobrecarga testada");
            System.out.println("✓ Método imprimirResumoReembolso(valorTotal) - Testado");
            System.out.println("✓ Regra de bônus de 10% para mais de 7 dias - Testada");
            System.out.println("✓ Três objetos diferentes criados e testados");
    }
}