package Exercicio8;

abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    protected static final double BONUS_BASE = 500.0;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public Funcionario(){
        this.nome = "";
        this.cpf = "";
        this.salarioBase = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public static double getBonusBase() {
        return BONUS_BASE;
    }

    public abstract double calcularSalario();

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Salário Total: R$ " + String.format("%.2f", calcularSalario()));
    }
}
