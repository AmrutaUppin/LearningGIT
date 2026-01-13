public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 0;
        int d[] = {1,2,3,4,5};
        try {
            //int k = b/c;
            System.out.println(d[6]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is catched");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException is catched");
        }
        catch (Exception e) {
            System.out.println("Exception is catched");
            //throw new RuntimeException(e);
        }
        finally {
            System.out.println("Cookies deleted ");
        }

    }
}
