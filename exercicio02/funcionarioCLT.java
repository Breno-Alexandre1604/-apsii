package exercicio02;

public class FuncionarioCLT extends Funcionario {
    private static final double DESCONTO_ADICIONAL = 50.00;

    private final double valeTransporte;
    private final double valeAlimentacao;

    public FuncionarioCLT(String nome, double salarioBase, int dataAdmissao) {
        this(nome, salarioBase, dataAdmissao, 0.00, 0.00);
    }

    public FuncionarioCLT(String nome, double salarioBase, int dataAdmissao,
            double valeTransporte, double valeAlimentacao) {
        super(nome, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + DESCONTO_ADICIONAL;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()
                + getValeTransporte()
                + getValeAlimentacao();
    }
}
