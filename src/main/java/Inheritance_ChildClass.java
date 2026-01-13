public class Inheritance_ChildClass extends Inheritance_ParentClass {
    public static void main(String[] args) {

        Inheritance_ChildClass c = new Inheritance_ChildClass();
        c.color();
        c.engine();
        c.gear();
        c.brake();
        c.audioSystem();
    }
    public void engine(){
        System.out.println("Engine code is implemented");
    }
    public void color(){
        System.out.println(color);
    }
}
