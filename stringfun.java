import java.util.Scanner;
class funstr
{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String firstName = "Tony";
        String lastName = "Stark";
        String fulname = firstName + " " + lastName;
        System.out.println(fulname.length());

        for(int i=0;i<fulname.length();i++)
        {
            System.out.println(fulname.charAt(i));
        }
    }
}