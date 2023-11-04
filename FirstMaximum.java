package Array;
public class MaxElement {
    public static void main(String[] args) {
       
        int arr[]={89,75,180,7,6,1,248,77,120};
        int n = arr.length;
        int max =0;
        for(int i=0;i<=n-1;i++)
       {

        if(arr[i]>max)
        {
            max=arr[i];
        }
       }
       System.out.println("maximum element = "+ max);
       
    }
    
}
