public class Arrays {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]= 2;
        a[1]=6;
        a[2]=1;
        a[3]=9;
        a[4]=12;
        for(int i=0;i<a.length;i++)
            {
            System.out.println(a[i]);
            }
        int b[][] = new int[2][3];
        b[0][0]=2;
        b[0][1]=4;
        b[0][2]=5;
        b[1][0]=3;
        b[1][1]=4;
        b[1][2]=7;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(b[i][j]);
            }
        }
    }
}
