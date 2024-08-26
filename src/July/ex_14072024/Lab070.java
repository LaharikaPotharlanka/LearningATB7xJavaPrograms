package July.ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Laharika");
        String s2 = new String("Harika");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Laharika
        System.out.println(s2);
        System.out.println(s3);
    }
}
//Harika
//Laharika