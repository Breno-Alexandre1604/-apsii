package exercicio02;

public class Funcionario {
    private static final double PERCENTUAL_DESCONTO = 0.08;

    private final String nome;
    private final double salarioBase;
    private final int dataAdmissao;

    public Funcionario(String nome, double salarioBase, int dataAdmissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getDataAdmissao() {
        return dataAdmissao;
    }

    public double calcularDesconto() {
        return salarioBase * PERCENTUAL_DESCONTO;
    }

    public double calcularSalario() {
        return salarioBase - calcularDesconto();
    }
}
