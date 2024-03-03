import java.util.Arrays;

public class SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] inputArray = {-4, -2, 0, 2, 4};

        int[] result = sortedSquares(inputArray);

        System.out.println("Sorted Squares: " + Arrays.toString(result));
    }
}
