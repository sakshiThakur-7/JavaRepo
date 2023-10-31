package RecursionFunction;

public class PrimeNo 
{
    static boolean PrimeNo(int n,int i)
    {
        if(i>n/2)
        {
            return true;
        }
        if(n%i==0)
        {
            return false;
        }
        return PrimeNo(n,i+1);
    }
    public static void main(String[] args) 
  {
        int n=27;
        if(PrimeNo(n,2))
        {
            System.out.println("prime");
        }
        else
        System.out.println("not prime");
    }
}
