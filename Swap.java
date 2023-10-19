import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two different number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("before: a = " + a + " and before b = " + b);
        int f = a * b;
        int g = f / a;
        int h = f / b;
        System.out.println("after: a = " + g + " and after b = " + h);

    }
}
