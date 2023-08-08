import java.util.Scanner;
class ifdemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the marks of first sub:");
        float sub1 = sc.nextFloat();
        System.out.println("Entr the marks of second sub:");
        float sub2 = sc.nextFloat();
        System.out.println("Entr the marks of third sub:");
        float sub3 = sc.nextFloat();
        float total = sub1+sub2+sub3;
        System.out.println(total);
        float per = (total/3)*100;
        System.out.println(per);

    }
}