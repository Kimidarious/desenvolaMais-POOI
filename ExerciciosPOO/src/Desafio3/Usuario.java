package Desafio3;

public abstract class Usuario {
    public String nome;
    protected String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }
}
