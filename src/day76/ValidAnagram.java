package day76;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (final char c : s.toCharArray())
            ++count[c - 'a'];

        for (final char c : t.toCharArray()) {
            if (count[c - 'a'] == 0)
                return false;
            --count[c - 'a'];
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Is \"" + s1 + "\" an anagram of \"" + t1 + "\": " + validAnagram.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Is \"" + s2 + "\" an anagram of \"" + t2 + "\": " + validAnagram.isAnagram(s2, t2));
    }
}
