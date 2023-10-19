import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number to check which one is greater among three");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.println("all values are same !! \n so enter different value to check ");
        }
        if(a>b && a>c){
            System.out.println(a+" is greater among three");
        }
        if(b>a && b>c){
            System.out.println(b+" is greater among three");
        }
        if(c>a && c>b){
            System.out.println(c+" is greater among three");
        }
    }
    
}
