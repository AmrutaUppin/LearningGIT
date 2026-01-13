public class StaticVarMethods {
    String name; // Instance variable
    String address;
    static String city; //Static variable/ class variable
    static int i;
    static {
        city = "Bengaluru";
        i = 0;
    }
    public StaticVarMethods(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        int b = 0; //local variable
        System.out.println(i);
    }
    public void printAddress()
    {
        System.out.println(address+ " " + city);
    }
    public static void printCity(){
        System.out.println(city);
    }
    public static void main(String[] args){
        StaticVarMethods obj1 = new StaticVarMethods("Ravi", "Jayanagar");
        StaticVarMethods obj2 =  new StaticVarMethods("Ram", "JP Nagar");
        obj1.printAddress();
        obj2.printAddress(); //non static method with obj
        StaticVarMethods.printCity(); // Static method with call
        StaticVarMethods.i = 4; //static variable
    }
}
