public class NestedForLoop {
    public static void main(String[] args) {
       /* Print this pattern
        1 2 3 4
        5 6 7
        8 9
        10   */
//        int k = 0;
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4-i;j++){
//                k++;
//                System.out.print(k+"\t");
//            }
//            System.out.print("\n");
//        }

        /* Print this pattern
        1
        2 3
        4 5 6
        7 8 9 10   */
//        int k=1;
//        for(int i=1;i<5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(k+"\t");
//                k++;
//            }
//            System.out.print("\n");
//        }
        /* Print this pattern
        1
        1 2
        1 2 3
        1 2 3 4  */
//        for(int i=1;i<5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+"\t");
//            }
//            System.out.println();
//        }
        /* Print this pattern
        3
        6 9
        12 15 18*/
        int k=1;
        for(int i=1;i<4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k*3+"\t");
                k++;
            }
            System.out.println();
        }
    }
}
