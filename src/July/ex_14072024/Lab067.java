package July.ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Laharika";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Laharika");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds


    }
}
//laharika
//8
//LAHARIKA
//h
//L
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 8
//	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
//	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
//	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
//	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
//	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
//	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//	at java.base/java.lang.String.checkIndex(String.java:4881)
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
//	at java.base/java.lang.String.charAt(String.java:1582)
//	at July.ex_14072024.Lab067.main(Lab067.java:19)