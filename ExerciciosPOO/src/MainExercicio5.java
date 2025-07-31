import Exercicio5.Contato;

public class MainExercicio5 {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Kim", "98765-4321");
        Contato contato2 = new Contato("Rapha", "12345-6789");

        System.out.println("--- CONTATOS INICIAIS ---");
        System.out.println(contato1.obterContatoFormatado());
        System.out.println(contato2.obterContatoFormatado());
        System.out.println();

        System.out.println("--- ATUALIZANDO TELEFONE DO JOÃO ---");
        System.out.println("Telefone anterior: " + contato1.getTelefone());
        contato1.atualizarTelefone("77777-7777");
        System.out.println("Telefone atualizado: " + contato1.getTelefone());
        System.out.println();

        System.out.println("--- CONTATOS ATUALIZADOS ---");
        System.out.println(contato1.obterContatoFormatado());
        System.out.println(contato2.obterContatoFormatado());
    }
}
