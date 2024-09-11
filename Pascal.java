import java.util.Scanner;

class Pascal {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter an integer n: ");
        int n = ip.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.println(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.println(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - i; j > 1; j--) {
                System.out.println(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.println(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}