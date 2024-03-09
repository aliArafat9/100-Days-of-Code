package day99;

public class ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if (i != -1) {
            StringBuffer sb = new StringBuffer(word.substring(0, i + 1));
            String s = new String(sb.reverse());
            s += word.substring(i + 1, word.length());
            return s;
        }
        return word;
    }

    public static void main(String[] args) {
        ReversePrefixofWord reversePrefixofWord = new ReversePrefixofWord();

        String originalWord = "abcdef";
        char prefixChar = 'c';
        String result = reversePrefixofWord.reversePrefix(originalWord, prefixChar);

        System.out.println("Original Word: " + originalWord);
        System.out.println("Prefix Character: " + prefixChar);
        System.out.println("Result: " + result);
    }
}
