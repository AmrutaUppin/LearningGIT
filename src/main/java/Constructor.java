public class Constructor {
    public static void main(String[] args) {
        Constructor c = new Constructor();
        c.getData();
        Constructor c2 = new Constructor(2,3);

    }
    public Constructor() {
        System.out.println("Im in the constructor");
    }
    public Constructor(int a, int b) {
        System.out.println("Im in the parameterized constructor");
    }
    public void getData(){
        System.out.println("Im in the method");
    }
}
