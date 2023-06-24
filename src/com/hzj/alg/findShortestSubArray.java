package com.hzj.alg;

import java.util.HashMap;
import java.util.Map;

public class findShortestSubArray {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,3,4,2};
        new findShortestSubArray().findShortestSubArray(a);
    }
    public int findShortestSubArray(int[] nums) {
        Map<Integer,int[]> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }
            int maxNum = 0,minLen = 0;
            for (Map.Entry<Integer,int[]> entry:map.entrySet()) {
                int[] arr = entry.getValue();
                if (maxNum < arr[0]) {
                    maxNum = arr[0];
                    minLen = arr[2] - arr[1] + 1;
                }else if (maxNum == arr[0]) {
                    if (minLen > arr[2] - arr[1] + 1) {
                        minLen = arr[2] -arr[1] + 1;
                    }
                }
            }
        return minLen;
    }
    public int findShortestSubArray1(int[] nums) {
        Map<Integer,int[]> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }else map.put(nums[i],new int[]{1,i,i});
        }
        int maxNum = 0,minLen = 0;
        for (Map.Entry<Integer,int[]> entry: map.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            }else if (maxNum == arr[0]) {

            }
        }
        return 0;
    }
}
