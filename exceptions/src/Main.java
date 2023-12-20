import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        try {
            a.toDeposit(-20);
        } catch (NegativeDepositException ex){
            System.out.println(ex.getMessage());
        }
    }

}