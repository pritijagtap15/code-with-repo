import java.util.Scanner;
class maindemo45
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}