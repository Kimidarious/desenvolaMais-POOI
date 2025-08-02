import Desafio3.Administrador;
import Desafio3.SegurancaUtils;

public class MainDesafio3 {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Eliakim", "eliakim@email.com", "dmin123");
        System.out.println("Nome (public)" + admin.nome);
//        System.out.println("Email (protected): " + admin.email);
//        System.out.println("Senha (private: ", + admin.senha);

        admin.exibirUsuario();

        boolean autenticado = admin.autenticar("admin123");
        System.out.println("Autenticado? " + autenticado);

        if (SegurancaUtils.validarSenhaForte("novaSenha123")){
            admin.redefinirSenha("novaSenha123");
            System.out.println("Senha redefinida com sucesso!");
        } else {
            System.out.println("Senha fraca. Tente novamente!");
        }
        System.out.println("Autenticado com nova senha? " + admin.autenticar("novaSenha123"));
    }
}
