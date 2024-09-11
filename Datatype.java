import java.util.Scanner;

class Datatype {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = scanner.nextLong();

        if (n >= -128 && n <= 127) {
            System.out.println("* byte");
        }
        if (n >= -32768 && n <= 32767) {
            System.out.println("* short");
        }
        if (n >= -2147483648L && n <= 2147483647L) {
            System.out.println("* int");
        }
        if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
            System.out.println(" * long");
        } else {
            System.out.println(n + " is too large to be stored in any primitive data type.");
        }
    }
}