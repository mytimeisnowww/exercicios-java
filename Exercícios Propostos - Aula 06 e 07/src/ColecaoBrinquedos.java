public class ColecaoBrinquedos {

    private Brinquedo[] brinquedos = new Brinquedo[10];

    void adicionarBrinquedos(Brinquedo brinquedo){
        int i;
        i = brinquedo.getQtdBrinquedos();
        brinquedos[i-1] = brinquedo;
    }
    void listarBrinquedos(){
        for (int i = 0; i < brinquedos[i].getQtdBrinquedos(); i++ ){
            brinquedos[i].mostrarInfos();
            brinquedos[i].ligar();
            brinquedos[i].mover();
        }
    }












}
