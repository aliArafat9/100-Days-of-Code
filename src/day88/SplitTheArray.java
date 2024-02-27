package day88;

public class SplitTheArray {
    public static boolean isPossibleToSplit(int[] nums) {
        int arr[] = new int[101];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i : arr) {
            if (i > 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numsToCheck = {1, 2, 3, 1, 2, 3};
        boolean result = isPossibleToSplit(numsToCheck);
        System.out.println("Is it possible to split the array? " + result);
    }
}
