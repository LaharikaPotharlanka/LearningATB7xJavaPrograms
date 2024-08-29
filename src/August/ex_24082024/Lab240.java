package August.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab240 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(98);
        marks.add(10);
        marks.add(99);
        Collections.sort(marks); // Natural Sorting
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Hari");
        names.add("Anitha");
        names.add("Anusha");
        names.add("Lucky");
        Collections.sort(names); // A,D,L,P // Natural Sorting First Alpha
        System.out.println(names);




    }
}
//[10, 14, 98, 99]
//[Anitha, Anusha, Hari, Lucky]