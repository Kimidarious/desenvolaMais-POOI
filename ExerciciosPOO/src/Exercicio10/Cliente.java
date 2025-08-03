package Exercicio10;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(){}

    public Cliente(String nome, String cpf, int idade) {
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty() ){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null){
            cpf = cpf.replaceAll("\\D", "");
        }

        if (cpf == null || cpf.length() != 11){
            throw new IllegalArgumentException("CPF deve ter exatamnete 11 digitos.");
        }

        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + formatarCpf(cpf) + '\'' +
                ", idade=" + idade +
                '}';
    }

    private String formatarCpf(String cpf){
        if (cpf != null && cpf.length() == 11){
            return cpf.substring(0, 3) + "." +
                    cpf.substring(3, 6) + "." +
                    cpf.substring(6, 9) + "-" +
                    cpf.substring(9, 11);

        }
        return cpf;
    }
}
