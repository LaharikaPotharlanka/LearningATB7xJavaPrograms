package August.ex_24082024;

import java.util.Stack;

public class Lab238 {
    public static void main(String[] args) {
        // Vector, Stack - Legacy - 95% of time we are not going to use it in automation
        // legacy? - old ->

        Stack s = new Stack();
        s.push("Laharika");
        s.push("Hari");
        s.push("Anitha");
        s.add("Anitha2");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());

        System.out.println(s);




    }
}
//[Laharika, Hari, Anitha, Anitha2]
//Anitha2
//Anitha2
//[Laharika, Hari, Anitha]