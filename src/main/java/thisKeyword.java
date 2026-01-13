public class thisKeyword {
    int a = 10;
    public void getData() {
        int a = 20;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println("Sum = " + (this.a + a));
    }
    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword();
        obj.getData();
    }
}
