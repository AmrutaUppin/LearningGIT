import java.util.ArrayList;

public class Collectors {
    public static void main(String[] args) {
        int a[] = {4,5,5,5,4,6,6,9,4};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int k = 0;
            if(!list.contains(a[i])){
                list.add(a[i]);
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        k++;
                    }
                }
                System.out.println(a[i] + " is present " + k + " times in the array");
                if(k==1){
                    System.out.println(a[i] + " is unique number");
                }
            }
        }
       // System.out.println(list);
    }
}
