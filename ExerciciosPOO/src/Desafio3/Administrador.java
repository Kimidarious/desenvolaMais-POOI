package Desafio3;

public class Administrador extends Usuario{
    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return getSenha().equals(senha);
    }

    public void redefinirSenha(String novaSenha) {
        setSenha(novaSenha);
    }
}
