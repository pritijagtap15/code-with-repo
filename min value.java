class masxele
{
    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5};
         int min = 5;
         for(int e : arr)
         {
            if(e<min)
            {
                min=e;
            }
         }
         System.out.println("min value is:" + min);
    }
}