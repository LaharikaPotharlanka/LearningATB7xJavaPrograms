package August.ex_04082024;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Balance!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");

        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);


        baicici.printDetails();

        sc.close();


    }
}
//Lab170+BankAccount
//Enter your Name of the Bank!
//SBI
//Enter your Balance!
//9000
//Enter your Name of the Bank cODE!
//sbi
//Bank Name -> SBI
//Bank Code -> sbi
//Bal ->9000