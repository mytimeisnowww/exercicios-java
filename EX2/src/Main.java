import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner np1 = new Scanner(System.in);
        System.out.print("Entre com a np1: ");
        int NP1 = np1.nextInt();
        Scanner np2 = new Scanner(System.in);
        System.out.print("Entre com a np2: ");
        int NP2 = np2.nextInt();
        int media = (NP1 + NP2) / 2;
        System.out.println("media final: "+media);

    }
}

