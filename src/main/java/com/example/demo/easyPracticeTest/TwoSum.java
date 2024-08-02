package com.example.demo.easyPracticeTest;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Problem : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public int[] twoSum(int[] nums, int target) {
        int[] sol=new int[2];
        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    sol[0] = i;
                    sol[1] = j;
                    return new int[] { i, j };
                }
            }
        }return new int[0];
    }
    public int[] twoSumA(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[0]; // Return an empty array if no solution is found
    }
}
