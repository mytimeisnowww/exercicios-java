public class Carro {

    String cor;
    String marca;
    Motor motor;
    double velocidadeMax;
    double velocidadeAtual;

    public Carro(){

        motor = new Motor();
    }

    void ligar(){

        System.out.println("voce ligou o carro! ");
    }

    void acelerar(){

        velocidadeAtual += 80.0d;
        System.out.println("voce acelerou, sua nova velocidade é: "+velocidadeAtual);
    }

    void mostrarInfos(){

        System.out.println("cor do carro: "+cor);
        System.out.println("marca do carro: "+marca);
        motor.mostrarInfos();
        System.out.println("velocidade maxima do carro: "+velocidadeMax);
        System.out.println("velocidade atual do carro "+velocidadeAtual);
    }
}
