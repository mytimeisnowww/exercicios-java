import java.io.Serializable;

public class Funcionario implements Serializable {
    public float salario = 0;
    public  String nome = null;
    public int numero = 0;

    public Funcionario(int numero, String nome, float salario) {
        this.salario = salario;
        this.nome = nome;
        this.numero = numero;
    }

    public String toString(){
        return numero+" "+nome+" "+salario;
    }
}
