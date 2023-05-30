import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arquivo a1 = new Arquivo();
        Livro l1 = new Livro("Os Animais","Jurisseia","Leya",196);
        a1.escrever(l1);

        ArrayList<Livro> livros = a1.ler();

        for(int i=0;i<livros.size();i++){
            System.out.println("Informações do livro:");
            System.out.println("Nome: "+livros.get(i).getNome());
            System.out.println("Autor: "+livros.get(i).getAutor());
            System.out.println("Editora: "+livros.get(i).getEditora());
            System.out.println("Quantidade de Páginas: "+livros.get(i).getQtdPaginas());
        }
    }
}