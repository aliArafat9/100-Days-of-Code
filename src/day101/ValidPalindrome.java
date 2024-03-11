package day101;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        // Example usage:
        String testString1 = "A man, a plan, a canal, Panama";
        boolean result1 = validPalindrome.isPalindrome(testString1);
        System.out.println("Is \"" + testString1 + "\" a palindrome? " + result1);

        String testString2 = "Race a car";
        boolean result2 = validPalindrome.isPalindrome(testString2);
        System.out.println("Is \"" + testString2 + "\" a palindrome? " + result2);
    }
}
