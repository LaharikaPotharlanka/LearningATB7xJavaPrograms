package July.ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);


        sc.close();

    }
}
//Enter your name
//Laharika
//Enter your age
//55
//Enter your Salary
//900000
//Your details are Laharika
//Your age is 55
//Your Salary is 900000.0