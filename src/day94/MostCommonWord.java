package day94;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] str = paragraph.toLowerCase().replaceAll("\\W+", " ").split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String i : str) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < banned.length; i++) map.remove(banned[i]);
        int max = -1;
        String ans = "";
        for (String i : map.keySet()) {
            if (max < map.get(i)) {
                ans = i;
                max = map.get(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. It contains some words, and some words are repeated. Repeated words should not be considered in the result.";
        String[] banned = {"is", "some", "words"};

        String result = mostCommonWord(paragraph, banned);
        System.out.println("The most common word is: " + result);
    }
}
