import java.util.Scanner;
class function
 {
   public static int sumNos(int a, int b)
   {
    int sum = a + b;
    return sum;
   } 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = sumNos(a, b);
    System.out.println(sum);
  }
}
