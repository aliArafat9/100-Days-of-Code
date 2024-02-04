package day61;

import java.util.HashMap;

public class RomantoInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int pval = 0;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int cval = hm.getOrDefault(s.charAt(i), 0);

            if (cval >= pval) {
                ans += cval;
            } else {
                ans -= cval;
            }

            pval = cval;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
