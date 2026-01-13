public class SuperKeyword_Child extends SuperKeyword_Parent {
    public static void main(String[] args) {
        SuperKeyword_Child child = new SuperKeyword_Child();
        child.getName();
        child.printMsg();
    }
    String name = "Upp";
    public void getName() {
        System.out.println(name); // local variable
        System.out.println(super.name); // parent class variable
    }
    public void printMsg() {
        super.printMsg(); //calls printMsg() from parent
        System.out.println("I am in child class");
    }
    public SuperKeyword_Child() {
        //super();
        System.out.println("Child class constructor");
    }
}
