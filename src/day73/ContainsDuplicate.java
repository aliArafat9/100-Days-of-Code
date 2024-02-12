import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (hset.contains(nums[idx])) {
                return true;
            }
            hset.add(nums[idx]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean result = containsDuplicate(nums);
        System.out.println("Array contains duplicate: " + result);
    }
}
