package August.ex_24082024;

import java.util.PriorityQueue;

public class Lab244 {
    public static void main(String[] args) {
        // Queue - < 1% in Automation
        //
        PriorityQueue pq= new PriorityQueue();
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
//[1, 3, 2, 4]
//1
//1
//[2, 3, 4]
