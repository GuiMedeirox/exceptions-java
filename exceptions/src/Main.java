import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN");
        try {
            m1();
        } catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("MAINF");

    }

    static void m1(){
        System.out.println("m1");
        m2();
        System.out.println("Fm1");
    }

    static  void m2(){
        System.out.println("M2");
        throw new ArithmeticException("Erro de ArithmeticException Customizado");
    }

}