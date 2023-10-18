public class Reverse_Rambas {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        for (int i = 0; i < m; i++) {

            for (int j = n; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
