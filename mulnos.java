import java.util.Scanner;

class mulnos
{
public static int calMul(int a, int b){
    int mul = a*b;
    return mul;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int mul = calMul(a,b);
    System.out.println("Multiplication is:" + mul);
}

}
