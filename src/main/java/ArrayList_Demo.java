import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Amm");
        list.add("Bob");
        list.add("Chris");
        list.add("David");
        System.out.println(list);
        list.add(1,"Added");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove("Bob");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.contains("Bob"));
        System.out.println(list.indexOf("Chris"));
        System.out.println(list.isEmpty());
    }
}
