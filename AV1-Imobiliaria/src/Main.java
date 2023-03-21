import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Imobiliaria imo = new Imobiliaria("MeTiraDaRua","(35)3423-4867","Passos");
        Apartamento apto;

        System.out.println("digite 1 para adicionar novos apartamentos.");
        System.out.println("digite 2 para reajustar o valor do aluguel.");
        System.out.println("digite 3 para ver a media da area de apartementos com 2 quartos ou menos.");
        System.out.println("digite 4 para ver as informaçoes da imobiliaria e dos apartamentos.");
        System.out.println("digite 0 para sair do menu.");

        Scanner entrada = new Scanner(System.in);
        int escolha;
        escolha = entrada.nextInt();
        while(escolha != 0){

            if (escolha == 1 ){
                apto = new Apartamento();
                Scanner entrada1 = new Scanner(System.in);
                System.out.println("entre com o endereço: ");
                apto.endereco = entrada1.nextLine();
                System.out.println("entre com o numero de quartos: ");
                apto.numQuartos = entrada1.nextInt();
                System.out.println("entre com a area: ");
                apto.area = entrada1.nextDouble();
                System.out.println("entre com o valor do aluguel: ");
                apto.aluguel = entrada1.nextDouble();
                imo.addApartamento(apto);
            }
            if (escolha == 2){
                Scanner entrada2 = new Scanner(System.in);
                System.out.println("entre com o numero do aprtamento do qual deseja o reajuste do aluguel: ");
                imo.ajustaAluguel(entrada2.nextInt());
            }
            if (escolha == 3){
                System.out.println("media = "+imo.mediaArea());
            }
            if (escolha == 4){
                imo.mostraInfo();
            }
            System.out.println("digite 1 para adicionar novos apartamentos.");
            System.out.println("digite 2 para reajustar o valor do aluguel.");
            System.out.println("digite 3 para ver a media da area de apartementos com 2 quartos ou menos.");
            System.out.println("digite 4 para ver as informaçoes da imobiliaria e dos apartamentos.");
            System.out.println("digite 0 para sair do menu.");
            escolha = entrada.nextInt();
        }
    }
}
