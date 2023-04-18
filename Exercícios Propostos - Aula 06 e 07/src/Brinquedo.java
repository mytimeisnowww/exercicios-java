public class Brinquedo {

    private String modelo;
    private String cor;
    private static int qtdBrinquedos;

    public Brinquedo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        qtdBrinquedos++;
    }
    public static int getQtdBrinquedos() {
        return qtdBrinquedos;
    }
    void mover(){
        System.out.println("o brinquedo se moveu!");
    }
    void ligar(){
        System.out.println("o brinquedo está ligado!");
    }
    void mostrarInfos(){
        System.out.println("o modelo do brinquedo é: "+modelo+" e a cor do brinquedo é: "+cor);
    }
}
