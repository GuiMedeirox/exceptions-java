import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {

        try(Conexao con = new Conexao()){
            con.leDados();
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }

    }
}