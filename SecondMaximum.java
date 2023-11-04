package Array;

public class SecondMax 
{
    public static void main(String[] args) {
       
        int arr[]={100,9,99,101,550,990,73,23,100};
        int n = arr.length;
        int max = 0;
        int max2 = 0;
        for(int i=0;i<=n-1;i++)
       {
        if(arr[i]>max)
        {
            if(max>max2)
            {
                max2 =max;
            }
            max=arr[i];
        }
        
       }
       System.out.println("second max = "+max2);
       System.out.println("first max = "+max);
         
    }
}
