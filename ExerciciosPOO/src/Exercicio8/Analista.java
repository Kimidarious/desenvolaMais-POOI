package Exercicio8;

import Desafio3.SegurancaUtils;

public class Analista extends Funcionario{
    private String especialidade;
    private int anosExperiencia;

    public Analista(String nome, String cpf, double salarioBase, String especialidade, int anosExperiencia) {
        super(nome, cpf, salarioBase);
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public Analista(String nome, String cpf) {
        super(nome, cpf, 3000.0);
        this.especialidade = "";
        this.anosExperiencia = 0;
    }

    public Analista() {
        super();
        this.especialidade = "";
        this.anosExperiencia = 0;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public double calcularSalario() {
        return 3000.0 + BONUS_BASE;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== ANALISTA ===");
        super.exibirInformacoes();
        System.out.println("Especialidae: " + especialidade);
        System.out.println("Anos de experiência: " + anosExperiencia);
        System.out.println("=======================================");
    }

    public double calcularBonusComExperiencia(){
        return anosExperiencia * 100.0;
    }

    public double calcularSalarioComExperiencia(){
        return calcularSalario() + calcularBonusComExperiencia();
    }
}
