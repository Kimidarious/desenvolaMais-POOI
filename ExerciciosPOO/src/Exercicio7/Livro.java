package Exercicio7;

public class Livro {
    public String titulo;
    String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Livro(){
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
    }

    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO LIVRO ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("==========================");
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0){
            this.paginas = paginas;
        }
    }
}
