package exercicio03;

public class CD implements infoGerais {
    int numFaixas;

    public int getNumFaixas(int numFaixas) {
        return numFaixas;
    }

    public int setNumFaixas(int num) {
        this.numFaixas = num;
        return num;
    }

    public void exibiInformacoes() {
        System.out.println("Número de faixas: " + numFaixas);
    }
}
