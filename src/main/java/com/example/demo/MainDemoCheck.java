package com.example.demo;

import com.example.demo.easyPracticeTest.TwoSum;
import com.example.demo.easyPracticeTest.ValidParentheses;

import java.util.Arrays;

public class MainDemoCheck {
    public static void main(String[] args){
        // problem 1:
        TwoSum twoSum = new TwoSum();
        int[] num = {2, 5, 11, 15,7};
        int target=9;
        int[] result = twoSum.twoSum(num,target);
        System.out.println(Arrays.toString(result));
        int[] resultA = twoSum.twoSumA(num,target);
        System.out.println(Arrays.toString(resultA));

        //problem 2:
        ValidParentheses validParentheses = new ValidParentheses();
        String str = ")({})]";
        Boolean resultB = validParentheses.isValid(str);
        System.out.println("isValid : "+ resultB);
    }
}
