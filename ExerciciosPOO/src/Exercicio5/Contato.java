package Exercicio5;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void atualizarTelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }

    public String obterContatoFormatado() {
        return "Nome: " + nome + " | Telefone: " + telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
