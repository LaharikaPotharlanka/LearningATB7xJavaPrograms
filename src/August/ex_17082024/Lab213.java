package August.ex_17082024;

public class Lab213 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
//Start of the program
//Index 0 out of bounds for length 0
//0
//End of the program