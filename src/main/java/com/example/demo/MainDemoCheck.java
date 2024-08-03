package com.example.demo;

import com.example.demo.easyPracticeTest.MergeTwoSortedList;
import com.example.demo.easyPracticeTest.TwoSum;
import com.example.demo.easyPracticeTest.ValidParentheses;
import com.example.demo.helpingClasses.ListNode;
import java.util.Arrays;

public class MainDemoCheck {
    public static void main(String[] args){
        boolean flag = false;
        // problem 1: TwoSum
        if (flag){
            TwoSum twoSum = new TwoSum();
            int[] num = {2, 5, 11, 15,7};
            int target=9;
            int[] result = twoSum.twoSum(num,target);
            System.out.println(Arrays.toString(result));
            int[] resultA = twoSum.twoSumA(num,target);
            System.out.println(Arrays.toString(resultA));
        }

        //problem 2: ValidParentheses
        if (flag) {
            ValidParentheses validParentheses = new ValidParentheses();
            String str = ")({})]";
            Boolean resultB = validParentheses.isValid(str);
            System.out.println("isValid : " + resultB);
        }

        //problem 3: MergeTwoSortedList
        if (true) {
            ListNode list1 = new ListNode(1);
            list1.next = new ListNode(3);
            list1.next.next = new ListNode(4);
            ListNode list2 = new ListNode(2);
            list2.next = new ListNode(3);
            list2.next.next = new ListNode(5);
            MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
            ListNode mergedList = mergeTwoSortedList.mergeTwoLists(list1, list2);
            System.out.print("Merged List : ");
            for (int i : mergedList)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
