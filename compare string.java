import java.util.Scanner;
class funstr1
{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String firstName = "Tony";
        String lastName = "Stark";
        if(firstName.compareTo(lastName) == 0)
        {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }
    }
}