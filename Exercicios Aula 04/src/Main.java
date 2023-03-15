public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor = "Branco" ;
        carro1.marca = "BMW" ;
        carro1.motor.potencia = 400;
        carro1.motor.tipo = "8 cilindros";
        carro1.velocidadeMax = 240.00d;
        carro1.velocidadeAtual = 00.0d;

        System.out.println("------------------------------------------");
        System.out.println("Carro 1: ");
        carro1.mostrarInfos();
        carro1.ligar();
        carro1.acelerar();

        carro2.cor = "Preto" ;
        carro2.marca = "Ford" ;
        carro2.motor.potencia = 300;
        carro2.motor.tipo = "4 cilindros";
        carro2.velocidadeMax = 180.00d;
        carro2.velocidadeAtual = 00.0d;

        System.out.println("------------------------------------------");
        System.out.println("Carro 2: ");
        carro2.mostrarInfos();
        carro2.ligar();
        carro2.acelerar();
        System.out.println("------------------------------------------");
    }
}
