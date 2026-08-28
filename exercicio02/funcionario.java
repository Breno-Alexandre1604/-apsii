package exercicio02;

public class funcionario {
    String nome;
    double salarioBase;
    int dataAdmissao;

    public funcionario(String nome, double salarioBase, int dataAdmissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }
    public double calcularDesconto() {
        return salarioBase * 0.08 ; // 8%Exemplo de cálculo de desconto de 10%
    }

    public double calcularSalario() {
        
        return salarioBase - calcularDesconto() ; // Exemplo de cálculo de salário com aumento de 10%
    }
}
