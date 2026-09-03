package exercicio02;

public class Estagiario extends Funcionario {
    private final double valorBolsaAuxilio;
    private final int cargaHorariaSemanal;

    public Estagiario(String nome, double salarioBase, int dataAdmissao,
            double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public double getValorBolsaAuxilio() {
        return valorBolsaAuxilio;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        return valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto() {
        return 0.00;
    }
}
