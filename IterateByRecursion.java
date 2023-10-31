package RecursionFunction;

public class Iterate {
    static void Iterate(int n){
        if(n==0){
            return;
        }
        Iterate(n/10);
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        int n = 6757876;
        Iterate(n);
       
    }
    
}
