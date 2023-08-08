class pn3arr
{
    public static void main(String[] args) {
        float[] marks = {12.4f, 45.7f,34.7f,78.8f,89.0f};
        float sum=0;
        for(float element : marks)
        {
            sum=sum+element;
            
            
        }
        System.out.println("the value of avg is:"+sum/marks.length);
    }
}