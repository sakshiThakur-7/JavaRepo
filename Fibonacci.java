public class Fibonacci {
   
    public static void main(String[] args) {
        int num=8;
        int a=0;
        int b=1;

        System.out.println(a + " , " + b  );

        int nextTerm;

        for(int i=2; i<num;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;

            System.out.println(nextTerm);
        }
        
    }
}
