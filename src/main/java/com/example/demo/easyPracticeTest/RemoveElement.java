package com.example.demo.easyPracticeTest;

import java.util.Arrays;

public class RemoveElement {
    //iven an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
    //
    //Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    //
    //Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    //Return k.
    public int removeElement(int[] nums, int val) {
       int k = 0;
        for (int i : nums) {
            if (i != val){
                nums[k] = i;
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}
/*
* Intuition
* The code filters out elements equal to val and compacts the remaining elements to the beginning of the array.
* Approach
* Use a single pass through nums to copy non-val elements to the start of nums, updating k to reflect the new length.
*
* Complexity
* Time  Complexity (O(n))
* Space Complexity (O(1))
* */