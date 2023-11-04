package Array;

public class WithouLoop1to100 
{
    static void Print1(int c)
    {
        if(c==0)
        {
            return;
        }
        Print1(c-1);
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
        Print1(100);
    }
    
}
