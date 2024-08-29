package August.ex_18082024;

public class Lab226 {
    public static void main(String[] args) {
        try {
            String s1  = null;
            if (s1 == null){
                throw new Exception("Add a proper String or not null String");
            }
            s1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //



    }
}
//Exception in thread "main" java.lang.RuntimeException: java.lang.Exception: Add a proper String or not null String
//	at August.ex_18082024.Lab226.main(Lab226.java:12)
//Caused by: java.lang.Exception: Add a proper String or not null String
//	at August.ex_18082024.Lab226.main(Lab226.java:8)