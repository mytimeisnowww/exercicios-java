import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        User u1 = new User();
        boolean acertousenha = false;
        int escolha = -1;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        File file = new File("funcionarios.txt");
        ArrayList<Funcionario> fun = new ArrayList<>();
        ObjectOutputStream oos;
        ObjectInputStream ois;
        ListIterator li;

        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            fun = (ArrayList<Funcionario>)ois.readObject();
            ois.close();
        }

        u1.setSenha(Integer.parseInt(JOptionPane.showInputDialog("Cria a sua senha")));
        acertousenha = u1.logar(Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha para entrar")));
        while(acertousenha == false){
            acertousenha = u1.logar(Integer.parseInt(JOptionPane.showInputDialog("Senha errada!! Tente novamente")));
        }

        do{
            System.out.println("1.INSERIR");
            System.out.println("2.MOSTRAR");
            System.out.println("3.PROCURAR");
            System.out.println("4.DELETAR");
            System.out.println("5.ATUALIZAR");
            System.out.println("0.SAIR");
            System.out.println("ENTRE COM SUA ESCOLHA: ");
            escolha = s.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Quantos funcionarios voce quer inserir: ");
                    int n = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Entre com o numero do Funcionario: ");
                        int num = s.nextInt();
                        System.out.print("Entre com o nome do Funcionario: ");
                        String nome = s1.nextLine();
                        System.out.print("Entre com o salario do Funcionario: ");
                        int salario = s.nextInt();
                        fun.add(new Funcionario(num,nome,salario));
                    }
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(fun);
                    oos.close();
                break;
                case 2:
                    if(file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        fun = (ArrayList<Funcionario>) ois.readObject();
                        ois.close();

                        li = fun.listIterator();
                        System.out.println("------------------------------------");
                        while (li.hasNext())
                            System.out.println(li.next());
                        System.out.println("------------------------------------");
                    }
                    else{
                        System.out.println("Arquivo não existe!");
                    }
                    break;
                case 3:
                    if(file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        fun = (ArrayList<Funcionario>)ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.println("Entre com o numero do funcionario para a busca: ");
                        int num = s.nextInt();
                        li = fun.listIterator();
                        System.out.println("------------------------------------");
                        while (li.hasNext()) {
                            Funcionario e = (Funcionario) li.next();
                            if (e.numero == num) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Funcionario não encontrado!");
                        }
                        System.out.println("------------------------------------");
                    }
                    else{
                        System.out.println("Arquivo nao encontrado!");
                    }
                    break;
                case 4:
                    if(file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        fun = (ArrayList<Funcionario>)ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.print("Entre com o numero do funcionario para deletar: ");
                        int num = s.nextInt();
                        li = fun.listIterator();
                        System.out.println("------------------------------------");
                        while (li.hasNext()) {
                            Funcionario e = (Funcionario) li.next();
                            if (e.numero == num) {
                                li.remove();
                                found = true;
                            }
                        }
                        if (found) {
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(fun);
                            oos.close();
                            System.out.println("Funcionario deletado!");
                        }
                        else{
                            System.out.println("Funcionario não encontrado!");
                        }
                        System.out.println("------------------------------------");
                    }
                    else{
                        System.out.println("Arquivo não existe!");
                    }
                    break;
                case 5:
                    if(file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        fun = (ArrayList<Funcionario>)ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.print("Entre com o numero do funcionario que voce deseja atualizar: ");
                        int num = s.nextInt();
                        li = fun.listIterator();
                        System.out.println("------------------------------------");
                        while (li.hasNext()) {
                            Funcionario e = (Funcionario) li.next();
                            if (e.numero == num) {
                                System.out.println("Entre com o novo Nome do Funcionario:");
                                String fnome = s1.nextLine();

                                System.out.println("Entre com o novo salario:");
                                int fsal = s.nextInt();
                                li.set(new Funcionario(num,fnome,fsal));
                                found = true;
                            }
                        }
                        if (found) {
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(fun);
                            oos.close();
                            System.out.println("Funcionario Atualizado com sucesso!");
                        }
                        else{
                            System.out.println("Funcionario não encontrado!");
                        }
                        System.out.println("------------------------------------");
                    }
                    else{
                        System.out.println("Arquivo não existe!");
                    }
                    break;
            }
        }while(escolha != 0);
    }
}
