package August.ex_17082024;

public class Lab217 {
    public static void main(String[] amit) {

        try {
            int a = 10/0;
        } catch (Exception hari) {
            System.out.println("Div by Zero");
            //hari.getMessage()
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }
    }
}
//Div by Zero
//I will be always Executed, anyHow!!