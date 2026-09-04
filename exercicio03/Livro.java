package exercicio03;

public class Livro implements infoGerais {
    String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibiInformacoes() {
        System.out.println("Autor: " + autor);
    }
}
