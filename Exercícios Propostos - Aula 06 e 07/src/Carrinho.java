public class Carrinho extends Brinquedo {

    public Carrinho(String modelo, String cor) {
        super(modelo, cor);
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
        System.out.println("Carrinho: ");
        super.mostrarInfos();
    }
}
