package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("Laharika");
        mylist.add("Anitha");
        mylist.add("Hari");
        mylist.add("Anitha"); // Duplicate
        mylist.add("Anitha");
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Anitha");
        // Removes the first occurrence of the specified element from this list,
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());

        mylist.add("Laharika");
        mylist.add("Hari");
        mylist.add("Anitha");
        mylist.add("Hari"); // Duplicate
        mylist.add("Hari");

        System.out.println(mylist);
        mylist.add("Anitha");
        System.out.println(mylist);
        mylist.set(1, "Anusha");
        System.out.println(mylist);

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        System.out.println("    - - - --  " );

        // hOw to print?
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println("    - - - --  " );


        // Enhanced For loop
        for (Object o: mylist){
            System.out.println(o);
        }






    }
}
//[Laharika, Anitha, Hari, Anitha, Anitha]
//5
//[Laharika, Hari, Anitha, Anitha]
//[]
//true
//[Laharika, Hari, Anitha, Hari, Hari]
//[Laharika, Hari, Anitha, Hari, Hari, Anitha]
//[Laharika, Anusha, Anitha, Hari, Hari, Anitha]
//[Laharika, Anusha, Anitha, Hari, Hari, Anitha, 123, true]
//    - - - --
//Laharika
//Anusha
//Anitha
//Hari
//Hari
//Anitha
//123
//true
//    - - - --
//Laharika
//Anusha
//Anitha
//Hari
//Hari
//Anitha
//123
//true