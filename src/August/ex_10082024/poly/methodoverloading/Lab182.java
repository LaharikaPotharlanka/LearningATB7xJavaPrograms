package August.ex_10082024.poly.methodoverloading;

public class Lab182 {
    // Polymorphism

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2,3);
        double result2 = mathOperations.add(2.4,3.6);
        String result3 = mathOperations.add("Laharika","Hari");
        String result4 = mathOperations.add("Laharika",123);
        //String result4 = mathOperations.add("Laharika",12.34);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
//5
//6.0
//LaharikaHari
//Laharika123