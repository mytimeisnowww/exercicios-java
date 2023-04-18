public class Barco extends Brinquedo {

    public Barco(String modelo, String cor) {
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
        System.out.println("Barco: ");
        super.mostrarInfos();
    }
}
