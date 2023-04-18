public class Aviao extends Brinquedo {

    int qtdMotores;

    public Aviao(String modelo, String cor,int qtdMotores){
        super(modelo, cor);
        this.qtdMotores = qtdMotores;
    }
    @Override
    void mover() {
        super.mover();
    }
    @Override
    void ligar() {
        super.ligar();
    }
    @Override
    void mostrarInfos(){
        System.out.println("Avião: ");
        super.mostrarInfos();
        System.out.println("A quantidade de motores do avião é: "+qtdMotores);
    }
}
