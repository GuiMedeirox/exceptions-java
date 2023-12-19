import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN");
        try {
            m1();
        } catch(ArithmeticException | OpenFile ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("MAINF");

    }

    static void m1() throws OpenFile {
        System.out.println("m1");
        //sete o valor para A
        m2(3);
        System.out.println("Fm1");
    }

    static  void m2(int a) throws OpenFile{
        System.out.println("M2");
        if(a == 2){
            System.out.println("Opa, ta tudo bacana");
        }else {
            throw new OpenFile("Unknown File");
        }
        System.out.println("FM2");
    }
}