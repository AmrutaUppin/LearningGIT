import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Amm");
        set.add("Bob");
        set.add("Chris");
        set.add("David");
        System.out.println(set);
        set.add("Chris");
        System.out.println(set);
        set.remove("Amm");
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        Iterator<String> it = set.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
