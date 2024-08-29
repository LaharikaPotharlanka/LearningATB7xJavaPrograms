package August.ex_24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab245 {
    public static void main(String[] args) {
        // Map  - key and value pair
        // name:pramod, roll:31, phone:9876543210
        Map m1 = new HashMap();
//        Map m1 = new LinkedHashMap();
//        Map m1 = new TreeMap();
        m1.put("name","hari");
        m1.put("rollNo",123);
        m1.put("phone",98765432);
        System.out.println(m1);







    }
}
//{phone=98765432, name=hari, rollNo=123}