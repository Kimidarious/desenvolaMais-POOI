package Exercicio3;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
        this.matricula = null;
    }

    public void exibirDados(){
        System.out.println("=== DADOS DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + (matricula != null ? matricula : "Não informada"));
        System.out.println("Curso: " + curso);
        System.out.println("=====================");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Aluno{nome='%s', matricula='%s', curso='%s'}",
                                    nome, matricula, curso);
    }
}
