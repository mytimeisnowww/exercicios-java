public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    public Livro(String nome, String autor, String editora, int qtdPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    void mostraInfo(){
        System.out.println("Informações do livro:");
        System.out.println("Nome: "+nome);
        System.out.println("Autor: "+autor);
        System.out.println("Editora: "+editora);
        System.out.println("Quantidade de Páginas: "+qtdPaginas);
    }
}
