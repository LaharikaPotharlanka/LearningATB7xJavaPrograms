package August.ex_18082024;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if (name.equalsIgnoreCase("Laharika")){
            try {
                throw new Exception("Not allowed!!");
            } catch (Exception e) {
                System.out.println("Exception!!");
            }
        }else {
            System.out.println("Allowed!");
        }
    }
}
//Enter your name
//laharika
//Exception!!