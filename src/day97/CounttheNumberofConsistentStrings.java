package day97;

public class CounttheNumberofConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {

        int res = 0;
        outerloop:
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j))))
                    continue outerloop;
            }
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        CounttheNumberofConsistentStrings counter = new CounttheNumberofConsistentStrings();

        // Example usage:
        String allowedCharacters = "abc";
        String[] wordsArray = {"ab", "ac", "bc", "a", "b"};
        int result = counter.countConsistentStrings(allowedCharacters, wordsArray);

        System.out.println("Number of consistent strings: " + result);
    }
}
