package exercicio03;

public class Main {
    
    public static void main(String[] args) {
        Pista pista = new Pista();
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();
        
        System.out.println(pista.iniciarCorrida(carro));
        System.out.println(pista.iniciarCorrida(bicicleta));
    }
}
