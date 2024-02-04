package day56;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

public class FractionalKnapsack {
   public static double fractionalKnapsack(int W, Item[] arr, int n) {
        // Your code here
        double val = 0;
        double[][] ratio = new double[n][2];
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) arr[i].value / arr[i].weight;
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for (int i = n - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            double r = ratio[i][1];
            if (arr[index].weight <= W) {
                W -= arr[index].weight;
                val += arr[index].value;
            } else {
                val += r * W;
                break;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        Item[] items = {new Item(5, 6), new Item(10, 20), new Item(15, 30)};
        System.out.println(fractionalKnapsack(50, items, items.length));    }
}
