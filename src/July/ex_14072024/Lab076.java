package July.ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Laharika";
        //String s1 = "L a h a r i k a";
        //          |0|1|2|3|4|5|6|7|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("Hari"); // LaharikaHari
        System.out.println(s1);

    }
}
//i
//LaharikaHari