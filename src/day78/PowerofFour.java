package day78;

import java.util.Scanner;

public class PowerofFour {
    public static boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean result = isPowerOfFour(n);

        if (result) {
            System.out.println(n + " is a power of four.");
        } else {
            System.out.println(n + " is not a power of four.");
        }
    }
}