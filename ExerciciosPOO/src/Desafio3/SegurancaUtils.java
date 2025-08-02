package Desafio3;

public class SegurancaUtils {
    public static boolean validarSenhaForte(String senha) {
        boolean temBumeros = senha.matches(".*\\d.*");
        boolean tamanhoOk = senha.length() >= 8;
        return temBumeros && tamanhoOk;
    }
}
