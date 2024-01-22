package day52;

import java.util.Arrays;

public class MaximumIceCreamBars {

    //??
    public static int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int count = 0;

        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1, 2, 3, 4, 5}, 3));
    }
}