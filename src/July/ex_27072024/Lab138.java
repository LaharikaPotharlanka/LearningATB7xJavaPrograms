package July.ex_27072024;

public class Lab138 {
    public static void main(String[] args) {

        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        // elements are fixed.
        // len -> 6
        // who index - 3 ->
        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(marks_10_board[10]);


    }
}
//6
//99
//90
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
//	at July.ex_27072024.Lab138.main(Lab138.java:13)