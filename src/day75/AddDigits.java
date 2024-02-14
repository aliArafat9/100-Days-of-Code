package day75;

import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int result = addDigits(num);

        System.out.println("Result after adding digits: " + result);
        sc.close();
    }
}
