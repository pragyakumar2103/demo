package com.example.demo.easyPracticeTest;

import java.util.*;

public class RemoveDuplicates {
    //Given an integer array nums sorted in non-decreasing order,
    // remove the duplicates in-place such that each unique element appears only once.
    // The relative order of the elements should be kept the same.
    // Then return the number of unique elements in nums.
    public int removeDuplicates(int[] nums) {
        int[] uniqueNums =Arrays.stream(nums).distinct().toArray();
        int k = uniqueNums.length;
        System.arraycopy(uniqueNums,0,nums,0,k);
        return k;
    }

    public int removeDuplicatesA(int[] nums) {
        int j=1;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }/*
    Time Complexity : 0ms       -O(n)
    Space Complexity : 45.01MB  -O(1)
    */
}
