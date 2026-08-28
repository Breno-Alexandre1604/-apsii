package exercicio02;

public class estagiario extends funcionario {

    private double valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public estagiario(String nome, double salarioBase, int dataAdmissao,
            double valorBolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
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

