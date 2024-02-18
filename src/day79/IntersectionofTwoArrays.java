package day79;

import java.util.Arrays;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        for (int i : nums1) {
            temp[i] = 1;
        }
        int count = 0;
        for (int i : nums2) {
            if (temp[i] == 1) {
                count++;
                temp[i] = 2;
            }
        }
        int arr[] = new int[count];
        int j = 0;
        for (int i : nums2) {
            if (temp[i] == 2) {
                temp[i] = 1;
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.print("Intersection of two arrays: ");
        System.out.println(Arrays.toString(result));
    }
}
