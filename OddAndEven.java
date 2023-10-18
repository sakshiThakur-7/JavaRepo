public class OddAndEven {
    public static void main(String[] args) {
        int arr[] ={1, 23,4,12,26,27,9};

        int n=arr.length;
        int countEven =0;
        int countOdd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven +=1;
            }
            else{
                countOdd +=1;
            }
        }
        System.out.println("Even Elements count : " +countEven);
        System.out.println("Odd Elements count : " + countOdd );
    }
}
