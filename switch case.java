import java.util.Scanner;
class swtichdemo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age:");
        int age =  sc.nextInt();
        switch(age)
        {
            case 18:
                System.out.println("You are going to adult");
                break;

            case 21:
                System.out.println("You are join a job");
                break;
            case 60:
                System.out.println("You are so retire");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
} 