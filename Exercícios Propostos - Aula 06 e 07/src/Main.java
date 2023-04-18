public class Main {

    public static void main(String[] args) {

        ColecaoBrinquedos c1 = new ColecaoBrinquedos();

        int i = 0;

        Brinquedo a = new Aviao("boing", "branco", 2);
        c1.adicionarBrinquedos(a);
        Brinquedo b = new Barco("lancha", "vermelho");
        c1.adicionarBrinquedos(b);
        Brinquedo c = new Carrinho("audi","branco");
        c1.adicionarBrinquedos(c);

        c1.listarBrinquedos();

        System.out.println("A quantidade de brinquedos é: "+Brinquedo.getQtdBrinquedos());
    }
}
