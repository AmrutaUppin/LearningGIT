// Print smallest number in the matrix, and largest number in the column of smallest number
public class MultiDimensionalArrayInterCisco {
    public static void main(String[] args) {
        int a[][] = {{9, 4, 7}, {2, 6, 1}, {3, 8, 5}};
        int smallNumber = a[0][0];
        int minCol = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]<smallNumber){
                    smallNumber=a[i][j];
                    minCol = j;
                }
            }
        }
        System.out.println("Smallest number in matrix = " + smallNumber);
        int largeNumber = a[0][minCol];
        for (int i=0;i<3;i++){
            if(a[i][minCol]>largeNumber){
                largeNumber=a[i][minCol];
            }
        }
        System.out.println("Large number in that column = " + largeNumber);
    }
}
