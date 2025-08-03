package Exercicio7;

public class MainExercicio7 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        System.out.println("1. ACESSO DIRETO AOS ATRIBUTOS: ");

        System.out.println("Título (público): " + livro1.titulo);
        livro1.titulo = "O Cortiço";
        System.out.println("Título após modificação: " + livro1.titulo);

        System.out.println("Autor (default): " + livro1.autor);
        livro1.autor = "Aluísio Azevedo";
        System.out.println("Autor após modificação: " + livro1.autor);

        System.out.println("Páginas (via getter): " + livro1.getPaginas());
        livro1.setPaginas(320);
        System.out.println("Páginas após setter: " + livro1.getPaginas());

        System.out.println("\n2. ACESSO ATRAVÉS DO MÉTODO: ");

        livro1.exibirInformacoes();

        System.out.println("\n3. TESTANDO COM OUTRO LIVRO: ");
        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.setPaginas(328);
        livro2.exibirInformacoes();

        System.out.println("\n=== DEMONSTRAÇÃO DOS MODIFICADORES DE ACESSO ===");
        System.out.println("\nPUBLIC: Acessível em qualquer lugar");
        System.out.println("\nDEFAULT: Acessível no mesmo pacote");
        System.out.println("\nPRIVATE: Acessível apenas dentro da classe");
        System.out.println("\nPara acessar private, use get/setters!");
    }
}
