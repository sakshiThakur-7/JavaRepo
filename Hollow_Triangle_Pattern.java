public class Hollow_Square_Pattern {
    public static void main(String[] args) {
        int m = 5;
        int n = 8;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                     if (i == 4 || i+j == 5 ||   j-i == 3  ){
                         System.out.print(" * ");
                     }
                     else {
                         System.out.print("   ");
                     }
            }
            System.out.println();

        }
    }
}
