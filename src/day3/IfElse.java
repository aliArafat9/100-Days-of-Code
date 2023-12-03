import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        // Check the relation between n and m using if-else statement
        if (n < m) {
            System.out.println("lesser");
        } else if (n > m) {
            System.out.println("greater");
        } else {
            System.out.println("equal");
        }
    }
}
