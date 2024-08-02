package com.example.demo.easyPracticeTest;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Problem : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //You can return the answer in any order.
    //
    //
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
/*
twoSumA :
Intuition
Using Hashmap to keep track of elements and their indices.getting the compliment for each element and checking if it exists in the hashmap. otherwise storing it n=in the hashmap with its index.

Approach
Initializing Hashmap is a constant time operation[O(1)]-time.
Iterate through the array once, computing its compliment[O(n)]-time.
worst case scenario, we need to store until the last elements[O(n)]-space.

Complexity
Time complexity:O(n)    2ms
Space complexity:O(n)   45.16MB
*/
