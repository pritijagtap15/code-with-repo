import java.util.Scanner;
class MAINDEMO788
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website");
        String website = sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("Organizational website");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("Indian website");
        }
    }
}