import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter amount,rate,time \n");

    float p = in.nextFloat();
    float r = in.nextFloat();
    float t = in.nextFloat();

    SimpleIntrest(p,r,t);
  }
  public static void SimpleIntrest(float x, float y, float z){
    float SI;
    SI = ((x*y*z)/100);
    System.out.println("\n simple intrest = "+SI);
  }
}
