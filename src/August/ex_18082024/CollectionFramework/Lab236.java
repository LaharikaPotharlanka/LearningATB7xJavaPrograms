package August.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab236 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // FR - CO
        mylist1.add("Laharika");
        mylist1.add("Anusha");
        mylist1.add("Anitha");
        mylist1.add("Hari");
        mylist1.add("Hari");
        mylist1.add("Hari");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Laharika"); // t1
        v.add("Anusha"); // t1
        v.add("Hari"); // t1
        System.out.println(v);
        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consumming
        // One by One - usage
        // Slower



    }
}
//[Laharika, Anusha, Anitha, Hari, Hari, Hari]
//[Laharika, Anusha, Hari]