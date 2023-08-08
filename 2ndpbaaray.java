class demoarr
{
    public static void main(String[] args) {
        float[] marks = {12.4f, 45.7f,34.7f,78.8f,89.0f};
        float num=45.5f;
        boolean isInArray = false;
        for(int i=0;i<marks.length;i++)
        {
            if(num==marks[i])
            {
                isInArray = true;
                break;
            }
            
        }
        if(isInArray){
            System.out.println("the value is present in an array");
        }
        else{
            System.out.println("Value is not present in an array");
        }
        
    }
}