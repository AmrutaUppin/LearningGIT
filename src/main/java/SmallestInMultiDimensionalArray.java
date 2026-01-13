public class SmallestInMultiDimensionalArray {
    public static void main(String[] args) {
        int a[][] = {{9,4,7},{2,6,1},{3,8,5}};
        int smallNumber = a[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //System.out.println(a[i][j]);
                if(a[i][j]<smallNumber){
                    smallNumber=a[i][j];
                }
            }
        }
        System.out.println(smallNumber);
    }
}
