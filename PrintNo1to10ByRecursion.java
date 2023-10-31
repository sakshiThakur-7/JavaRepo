package RecursionFunction;

public class Prime 
{
    static void Prime(int n)
  {
        if(n==0)
        {
            return;
        }
        Prime(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) 
  {
        Prime(10);
    } 
    
}
