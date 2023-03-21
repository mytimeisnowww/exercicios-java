public class Imobiliaria {

    String nome;
    String telefone;
    String cidade;
    Apartamento[] aptos = new Apartamento[30];
    int i = 0;

    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    void addApartamento(Apartamento apto){
        if(aptos[i] == null){
            aptos[i] = apto;
            i++;
        }
    }

    void ajustaAluguel(int num){
        aptos[num].aluguel = aptos[num].aluguel * 1.05;
        System.out.println("O novo aluguel é de R$"+aptos[num].aluguel);
    }

    int mediaArea(){
        double media = 0;
        int k = 0;
        for (int j = 0; j < i; j++){
            if (aptos[j].numQuartos < 3){
                media = media + aptos[j].area;
                k++;
            }
        }
        return (int) (media / k);
    }

    void mostraInfo(){
        System.out.println("nome da imobiliaria: "+nome);
        System.out.println("telefone da imobiliaria: "+telefone);
        System.out.println("cidade da imobiliaria: "+cidade);
        for (int j = 0; j < i; j++){
            System.out.println("apartamento: "+j);
            aptos[j].mostraInfo();
        }
    }
}
