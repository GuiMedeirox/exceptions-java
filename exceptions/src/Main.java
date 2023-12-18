import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = null;

        System.out.println("MAIN");
        m1();
        try{
            m1();
//            sc.next();
        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage());

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
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a = a / 0;
            System.out.println(a);
        }
        System.out.println("FM2");
    }

}