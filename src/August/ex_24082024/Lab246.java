package August.ex_24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab246 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put("id5",null);
//        map.put(null,100);
        map.put(null,101);
//        map.put("id5","laharika");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));

        System.out.println(" --- ");

        // How to iterate over all the elements in the map
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }











    }
}
//{null=101, id2=2, id4=null, id3=34, id=1, id5=null}
//6
//false
//true
//true
//false
//[null, id2, id4, id3, id, id5]
//[101, 2, null, 34, 1, null]
//34
// ---
//null -> 101
//id2 -> 2
//id4 -> null
//id3 -> 34
//id -> 1
//id5 -> null