class arrdemo23
{
    public static void main(String[] args) {
        float[] marks = {12.4f, 45.7f,34.7f,78.8f,89.0f};
        float sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
            
        }
        System.out.println("the value of sum is:"+sum);
    }
}