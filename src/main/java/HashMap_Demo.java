import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0,"Hello");
        map.put(1,"World");
        map.put(2,"Morning");
        map.put(3,"GoodBye");
        System.out.println(map);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map);
        Set set = map.entrySet();
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
           Map.Entry entry = (Map.Entry) iterator.next();
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
           //System.out.println(iterator.next());
        }
    }
}
