class mainjavademo
{
    public static void main(String[] args) {
        int [] [] mat1 = {{1,2,3 },   
                          {4,5,6}};
        int [] [] mat2 = {{10,20,30 },   
                          {40,50,60}};
        int [] [] result = {{0,0,0 },   
                          {0,0,0}};
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++)
            {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
        }
        

    }
}