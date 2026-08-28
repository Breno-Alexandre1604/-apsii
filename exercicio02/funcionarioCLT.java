package exercicio02;

public class funcionarioCLT extends funcionario{

    private double valeTransporte;
    private double valeAlimentacao;

    public funcionarioCLT(String nome, double salarioBase, int dataAdmissao) {
        this(nome, salarioBase, dataAdmissao, 0, 0);
    }

    public funcionarioCLT(String nome, double salarioBase, int dataAdmissao,
            double valeTransporte, double valeAlimentacao) {
        super(nome, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public double calcularValeTransporte() {
        return valeTransporte;
    }

    public double calcularValeAlimentacao() {
        return valeAlimentacao;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50.00;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()
                + calcularValeTransporte()
                + calcularValeAlimentacao();
    }
   
} 