public class SwapTwoNumber {
    public static void main(String[] args) {
        int a =10;
        int b =2;

        System.out.println("Before swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        int temp ;

        temp =a;
        a=b;
        b=temp;

        System.out.println("After Swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        
    }
}
