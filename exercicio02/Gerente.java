package exercicio02;

public class Gerente extends FuncionarioCLT {
    private static final int LIMITE_EQUIPE = 10;
    private static final double BONUS_EQUIPE_GRANDE = 100.00;

    private final int tamanhoEquipe;
    private final double percentualBonus;

    public Gerente(String nome, double salarioBase, int dataAdmissao,
            double valeTransporte, double valeAlimentacao,
            int tamanhoEquipe, double percentualBonus) {
        super(nome, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus / 100.00;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();

        if (tamanhoEquipe > LIMITE_EQUIPE) {
            desconto += BONUS_EQUIPE_GRANDE;
        }

        return desconto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()
                + getSalarioBase() * percentualBonus;
    }
}
