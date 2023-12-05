
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.lang.*;

public class HashMapOperations {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        System.out.println("HashMap: " + hashMap);

        String key = "Bob";
        if (hashMap.containsKey(key)) {
            int value = hashMap.get(key);
            System.out.println(key + "'s age is " + value);
        } else {
            System.out.println(key + " not found in the HashMap");
        }

        String searchKey = "David";
        if (hashMap.containsKey(searchKey)) {
            System.out.println(searchKey + " found in the HashMap");
        } else {
            System.out.println(searchKey + " not found in the HashMap");
        }

        String removeKey = "Alice";
        if (hashMap.containsKey(removeKey)) {
            hashMap.remove(removeKey);
            System.out.println(removeKey + " removed from the HashMap");
        } else {
            System.out.println(removeKey + " not found in the HashMap");
        }

        System.out.println("Updated HashMap: " + hashMap);

        System.out.println("Iterating through HashMap using keySet:");
        Set<String> keySet = hashMap.keySet();
        for (String k : keySet) {
            int value = hashMap.get(k);
            System.out.println(k + ": " + value);
        }

        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
