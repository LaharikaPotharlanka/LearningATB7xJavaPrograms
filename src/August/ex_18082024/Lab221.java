package August.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab221 {
    public static void main(String[] args) throws FileNotFoundException,ArithmeticException  {
        readFile();
    }

    private static void readFile() throws FileNotFoundException,ArithmeticException {
        System.out.println("Hello Laharika");
        String path = "/Users/laharika/Downloads/Ad1.mp4";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        // read the file txt it can read the file
        System.out.println("End of the program");


    }
}
//Hello Laharika
//Exception in thread "main" java.io.FileNotFoundException: \Users\laharika\Downloads\Ad1.mp4 (The system cannot find the path specified)
//	at java.base/java.io.FileInputStream.open0(Native Method)
//	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
//	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
//	at java.base/java.io.FileReader.<init>(FileReader.java:75)
//	at August.ex_18082024.Lab221.readFile(Lab221.java:16)
//	at August.ex_18082024.Lab221.main(Lab221.java:9)