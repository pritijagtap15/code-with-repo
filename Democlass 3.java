import java.util.Scanner;
class Demo
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a M3 marks");
    float math = sc.nextFloat();

    System.out.println("Enter a CNS marks");
    float CNS = sc.nextFloat();

    System.out.println("Enter a TOC marks");
    float TOC = sc.nextFloat();

    System.out.println("Enter a MP marks");
    float MP = sc.nextFloat();

    System.out.println("Enter a DBMS marks");
    float DBMS = sc.nextFloat();

    float Total = math+CNS+TOC+MP+DBMS;

    System.out.println("Total Marks:");
    System.out.println(Total);

    float per = (Total/500)*100;
    System.out.println("Percentages");
    System.out.println(per);

    

    }
}