import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    void escrever(Livro livro){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linha;
        linha = "Nome: "+livro.getNome()+",Autor: "+livro.getAutor()+",Editora: "
        +livro.getEditora()+",qtdPaginas: "+livro.getQtdPaginas();
        try{
            os = new FileOutputStream("ArquivosLivros.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("-Livro-");
            bw.newLine();
            bw.write(linha);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            try{
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    ArrayList<Livro> ler(){
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaler;

        ArrayList<Livro> encontrei = new ArrayList();

        try{
            is =  new FileInputStream("ArquivosLivros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            try{
                linhaler = br.readLine();
                while(linhaler!=null){
                    if(linhaler.contains("-Livro-")){
                        Livro aux = new Livro();
                        aux.setNome(br.readLine());
                        aux.setAutor(br.readLine());
                        aux.setEditora(br.readLine());
                        aux.setQtdPaginas(Integer.parseInt(br.readLine()));
                        encontrei.add(aux);
                    }
                    linhaler = br.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            try{
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return encontrei;

    }
}
