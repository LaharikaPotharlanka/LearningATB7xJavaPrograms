package August.ex_18082024;

public class Lab223 {
    public static void main(String[] args) throws Exception {
        // throw
        // Custom Exception
        Bank sbi = new Bank("INR", 100);
//        Bank icici = new Bank("INR",  10);
//        Integer total = sbi.add(icici);
//        System.out.println(total);

        Bank jpmorgan = new Bank("AED", 89);
        Integer totalnew = sbi.add(jpmorgan);
        System.out.println(totalnew);

    }
}
//Exception in thread "main" java.lang.RuntimeException: java.lang.Exception: Currency Doesn't Match!
//	at August.ex_18082024.Bank.add(Bank.java:34)
//	at August.ex_18082024.Lab223.main(Lab223.java:13)
//Caused by: java.lang.Exception: Currency Doesn't Match!
//	at August.ex_18082024.Bank.add(Bank.java:32)
//	... 1 more