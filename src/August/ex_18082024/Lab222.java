package August.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab222 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 10 / 0; // un - ar
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("e1");

        }catch (Exception e2){
            System.out.println("e2");
        }finally {
            System.out.println("FF");
        }

        FileReader f = new FileReader(new File("/Users/laharika/Downloads/Ad1.mp4"));


    }
}
//e1
//FF
//Exception in thread "main" java.io.FileNotFoundException: \Users\laharika\Downloads\Ad1.mp4 (The system cannot find the path specified)
//	at java.base/java.io.FileInputStream.open0(Native Method)
//	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
//	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
//	at java.base/java.io.FileReader.<init>(FileReader.java:75)
//	at August.ex_18082024.Lab222.main(Lab222.java:20)