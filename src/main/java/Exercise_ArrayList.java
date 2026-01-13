import java.util.ArrayList;

public class Exercise_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("mango");
        list.add("apple");
        System.out.println(list);
        list.remove("apple");
        System.out.println(list);
        System.out.println("Is orange found? = " + list.contains("orange"));
        System.out.println("Size = " + list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " = " + list.get(i));
        }
    }
}
