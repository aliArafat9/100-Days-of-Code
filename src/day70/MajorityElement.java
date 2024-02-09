package day70;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Integer ans = null;
        int count = 0;

        for (final int num : nums) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 2, 2, 5};
        System.out.println(majorityElement(nums));
    }
}
