package August.ex_24082024;

import static August.ex_24082024.Lab250.sum;

public class Lab250 {
    public static void main(String[] args) {

        temp("Hari");
        temp(123);
        temp(true);

        sum(3,4);
        sum("anusha","hari");

        // T - Ref to the Data Type that you want to use.

    }

    public static <hari> hari sum(hari a, hari b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <Anusha> void temp(Anusha name) {
        System.out.println(name);
    }
}
//Hari
//123
//true
//3
//4
//anusha
//hari