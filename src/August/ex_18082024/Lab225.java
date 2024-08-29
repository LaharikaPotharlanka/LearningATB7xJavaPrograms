package August.ex_18082024;

import java.util.Scanner;

public class Lab225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            if( x == 0){
                throw new ArithmeticException("Enter non zero number");
            }
            int a  = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
//10
//1
//0
//Exception in thread "main" java.lang.RuntimeException: java.lang.ArithmeticException: Enter non zero number
//	at August.ex_18082024.Lab225.main(Lab225.java:16)
//Caused by: java.lang.ArithmeticException: Enter non zero number
//	at August.ex_18082024.Lab225.main(Lab225.java:11)
