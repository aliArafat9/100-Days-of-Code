package day50;

public class ThreeDivisors {

    //??
    public static boolean isThree(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 3;
    }

    public static void main(String[] args) {
        System.out.println(isThree(4));
    }
}