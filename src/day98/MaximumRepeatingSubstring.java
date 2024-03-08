package day98;

public class MaximumRepeatingSubstring {
    public static int maxRepeating(String sequence, String word) {
        int c = 0;
        String add = word;
        while (sequence.contains(word) == true) {
            c += 1;
            word = word + add;
            // System.out.println(word);
        }
        return c;
    }

    public static void main(String args[]) {
        String sequence = "ababcabcabc";
        String word = "abc";

        int result = maxRepeating(sequence, word);

        System.out.println("Maximum repeating count: " + result);
    }
}
