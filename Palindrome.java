public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int rev =0;
        int rem ;
        int temp;

        temp=num;

        while(temp!=0){
            rem =temp%10;
            rev = rev * 10 + rem ;
            temp =temp/10;



        }
        if(num==rev){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not  Palindrome");
        }
    }
}
