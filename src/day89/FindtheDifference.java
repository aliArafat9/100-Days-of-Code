package day89;

public class FindtheDifference {
    public static char findTheDifference(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray()) c ^= cs;
        for (char ct : t.toCharArray()) c ^= ct;
        return c;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char result = findTheDifference(s, t);

        System.out.println("The added character is: " + result);
    }
}