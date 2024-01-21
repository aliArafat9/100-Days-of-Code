package day51;

public class BinaryNumberWithAlternatingBits {

    //??
    public static boolean hasAlternatingBits(int n) {

        String ans = Integer.toBinaryString(n);
        for (int i = 1; i < ans.length(); i++) {
            if (ans.charAt(i - 1) == ans.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
}