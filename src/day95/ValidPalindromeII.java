package day95;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args){
        ValidPalindromeII validator = new ValidPalindromeII();

        // Example usage:
        String input1 = "aba";
        String input2 = "abcba";
        String input3 = "abca";

        System.out.println("Is '" + input1 + "' a valid palindrome? " + validator.validPalindrome(input1));
        System.out.println("Is '" + input2 + "' a valid palindrome? " + validator.validPalindrome(input2));
        System.out.println("Is '" + input3 + "' a valid palindrome? " + validator.validPalindrome(input3));
    }
}
