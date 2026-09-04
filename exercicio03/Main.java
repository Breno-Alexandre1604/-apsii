package exercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        infoGerais livro = new Livro();
        infoGerais cd = new CD();

        System.out.print("Digite o nome do livro: ");
        String nomeLivro = sc.nextLine();
        ((Livro) livro).setAutor(nomeLivro);

        System.out.print("Digite o número de faixas do CD: ");
        int numFaixas = sc.nextInt();
        ((CD) cd).setNumFaixas(numFaixas);
        
        livro.exibiInformacoes();
        cd.exibiInformacoes();
    }
    
}
