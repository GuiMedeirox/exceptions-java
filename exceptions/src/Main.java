import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {

        Conexao con = new Conexao();
        try{
            con.leDados();
        } catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        } finally {
            con.fecharConexao();
        }

    }
}