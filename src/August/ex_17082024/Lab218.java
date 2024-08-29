package August.ex_17082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Lab218 {
    public static void main(String[] args) {
        try {
            int a = 10/0; // Uncheck Ath E
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
//Exception in thread "main" java.lang.RuntimeException: java.lang.ArithmeticException: / by zero
//	at August.ex_17082024.Lab218.main(Lab218.java:11)
//Caused by: java.lang.ArithmeticException: / by zero
//	at August.ex_17082024.Lab218.main(Lab218.java:9)