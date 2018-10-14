package com.solarexsoft.datastructure.sort;

/**
 * Created by houruhou on 2018/10/14.
 * Desc:
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int val) {
        int low = 0, high = nums.length -1; // 左闭右开
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == val) {
                return mid;
            } else if (nums[mid] < val) {
                low = mid+1;
            } else if (nums[mid] > val) {
                high = mid-1;
            }
        }
        return -1;
    }
    public static int binarySearchIndex(int[] nums, int fromIndex, int toIndex, int val) {
        int low = fromIndex;
        int high = toIndex - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == val) {
                return mid;
            } else if (nums[mid] > val) {
                high = mid - 1;
            } else if (nums[mid] < val) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
