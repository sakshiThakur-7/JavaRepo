import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two different number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;

        System.out.println("area of rectangle = "+c);

    }
}
