class arraylendemo
{
    public static void main(String[] args) {
        int[] marks = {100,10,45,67,89};
       // System.out.println(marks.length);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Reverse order");
         for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
        System.out.println("for each loop");
        for(int element : marks)
        {
            System.out.println(element);
        }
    }
}