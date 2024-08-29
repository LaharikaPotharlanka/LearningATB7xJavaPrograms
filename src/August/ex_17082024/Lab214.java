package August.ex_17082024;

public class Lab214 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip = null; // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a = 0; // NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b = 0; // ArithmeticException
        try {
            b = 1000 / a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
//Start of the program
//Exception in thread "main" java.lang.RuntimeException: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//	at August.ex_17082024.Lab214.main(Lab214.java:11)
//Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//	at August.ex_17082024.Lab214.main(Lab214.java:9)