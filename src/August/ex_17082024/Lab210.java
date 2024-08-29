package August.ex_17082024;

public class Lab210 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip = args[0]; // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException
        int b = 1000/a; // ArithmeticException
        System.out.println(b);
        System.out.println("End of the program");

        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main Called
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLI
        //3. Lab209.main(0)
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.  G














    }
}
//Start of the program
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//	at August.ex_17082024.Lab210.main(Lab210.java:7)