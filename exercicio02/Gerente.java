package exercicio02;

public class Gerente extends funcionarioCLT {

    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, double salarioBase, int dataAdmissao,
        double valeTransporte, double valeAlimentacao,
        int tamanhoEquipe, double percentualBonus) {
    super(nome, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
    this.tamanhoEquipe = tamanhoEquipe;
    this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();

        if (tamanhoEquipe > 10) {
            desconto += 100.00;
        }

        return desconto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()
                + salarioBase * percentualBonus;
    }
    
}
