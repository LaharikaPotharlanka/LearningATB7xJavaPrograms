package July.ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "Laharika";
        s1 = "Hari";

        StringBuffer stringBuffer = new StringBuffer("Laharika");
        // change the value of string - Buffer
        stringBuffer.append("Hari"); //LaharikaHari
        stringBuffer.append("JI"); //Laharika

        StringBuilder stringBuilder = new StringBuilder("Harika");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)


    }
}
//No o/p