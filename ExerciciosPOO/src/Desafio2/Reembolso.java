package Desafio2;

public class Reembolso {
    private String nomeFuncionario;
    private int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados){
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularReembolso(double alimentacao, double transporte, double hospedagem){
        double reembolsoTotal = alimentacao  + transporte + hospedagem;

        if (diasTrabalhados > 7){
            reembolsoTotal *= 1.10;
        }
        return reembolsoTotal;
    }

    public double calcularReembolso(double alimentacao, double transporte){
        return calcularReembolso(alimentacao, transporte, 0.0);
    }

    public void imprimirResumoReembolso(double valorTotal){
        System.out.printf("Funcionário: %s - Dias Trabalhados: %d - Reembolso Total: R$ %.2f%n",
                nomeFuncionario, diasTrabalhados, valorTotal);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
}
