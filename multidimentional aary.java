import java.util.Scanner;


class 2marr
{
    public static void main(String[] args) 
        
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] numbers = new int[2][4];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                int[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               System.out.println(numbers[i][j]); 
            }
        }
         
    }
}