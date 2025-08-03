package Exercicio8;

public class MainExercicio8 {
    public static void main(String[] args) {
        System.out.println("1. TESTE COM CONSTRUTOR COMPLETO:");
        Analista analista1 = new Analista("Eliakim Simões", "123.456.789-89", 3000.00, "Sistemas", 5);
        analista1.exibirInformacoes();

        System.out.println("\n2. TESTE COM CONSTRUTOR SIMPLIFICADO:");
        Analista analista2 = new Analista("Rapha Santos", "123.456.789-96");
        analista2.setEspecialidade("Banco de Dados");
        analista2.setAnosExperiencia(3);
        analista2.exibirInformacoes();

        System.out.println("\n3. TESTE COM CONSTRUTOR PADRÃO:");
        Analista analista3 = new Analista();
        analista3.setNome("Alison Rodrigo");
        analista3.setCpf("589.456.789-00");
        analista3.setEspecialidade("Desenvolvimento Web");
        analista3.setAnosExperiencia(7);
        analista3.exibirInformacoes();

        System.out.println("\n4. DEMONSTRAÇÃO DO POLIMORFISMO");
        Funcionario funcionario = new Analista("Tacobarry", "456;869;563;23");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário (via polimorfismo): R$ " + String.format("%.2f", funcionario.calcularSalario()));

        System.out.println("\n5. TESTES DOS MÉTODOS ESPECIFICOS:");
        System.out.println("Salário base de Analista: R$ " + String.format("%.2f", analista1.calcularSalario()));
        System.out.println("Bônus por experiência R$ " + String.format("%.2f", analista1.calcularBonusComExperiencia()));
        System.out.println("Salário total com experiência: R$ " + String.format("%.2f", analista1.calcularSalarioComExperiencia()));

        System.out.println("\n6. CONSTANTE BÔNUS_BASE:");
        System.out.println("BÔNUS_BASE: R$ " + String.format("%.2f", Funcionario.getBonusBase()));
        System.out.println("Fórmula do salário: 3000 + " + Funcionario.getBonusBase() + " = R$ " + String.format("%.2f", analista1.calcularSalario()));

        System.out.println("\n === DEMONSTRAÇÃO DA HERANÇA ===");
        System.out.println("✅ Analista herda de Funcionario");
        System.out.println("✅ Implementa calcularSalario() = 3000 + BONUS_BASE");
        System.out.println("✅ Acessa atributos protected da classe pai");
        System.out.println("✅ Pode sobrescrever métodos(polimorfismo)");
        System.out.println("✅ Adiciona funcionalidades especificas");
    }
}
