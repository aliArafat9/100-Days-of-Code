package day28;

import java.math.*;
import java.util.Scanner;

public class MultiplyStrings {

    //??
    public static String multiply(String num1, String num2) {

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger c = a.multiply(b);

        return c.toString(10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        System.out.println(multiply(num1, num2));
    }
}