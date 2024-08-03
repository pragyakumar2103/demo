package com.example.demo;

import com.example.demo.difficultPracticeTest.MergeKSortedList;
import com.example.demo.easyPracticeTest.Factorial;
import com.example.demo.easyPracticeTest.MergeTwoSortedList;
import com.example.demo.easyPracticeTest.TwoSum;
import com.example.demo.easyPracticeTest.ValidParentheses;
import com.example.demo.helpingClasses.ListNode;
import com.example.demo.mediumPracticeTest.GenerateParentheses;
import com.example.demo.mediumPracticeTest.SwapNodesInPairs;

import java.util.Arrays;
import java.util.List;

public class MainDemoCheck {
    public static void main(String[] args) {
        String input = "SwapNodesInPairs";
        switch (input) {
            case "TwoSum":
                TwoSum twoSum = new TwoSum();
                int[] num = {2, 5, 11, 15, 7};
                int target = 9;
                int[] result = twoSum.twoSum(num, target);
                System.out.println(Arrays.toString(result));
                int[] resultA = twoSum.twoSumA(num, target);
                System.out.println(Arrays.toString(resultA));
                break;

            case "ValidParentheses":
                ValidParentheses validParentheses = new ValidParentheses();
                String str = ")({})]";
                Boolean resultB = validParentheses.isValid(str);
                System.out.println("isValid : " + resultB);
                break;

            case "MergeTwoSortedList":
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
                    System.out.print(i + " ");
                System.out.println();
                break;

            case "MergeKSortedList":

                MergeKSortedList mergeKSortedList = new MergeKSortedList();
                //ListNode mergedList1 = mergeKSortedList.mergeKLists();
                break;

            case "GenerateParentheses":
                GenerateParentheses generateParentheses = new GenerateParentheses();
                List<String> resultC = generateParentheses.generateParenthesis(3);
                System.out.println("result : ");
                for (String str1 : resultC){
                    System.out.println(str1);
                }
                List<String> resultD = generateParentheses.generateParenthesisA(2);
                System.out.println("result : ");
                for (String str1 : resultD){
                    System.out.println(str1);
                }
                break;

            case "Factorial":
                Factorial factorial = new Factorial();
                double number = 50;
                double resultE = factorial.factorial(number);
                System.out.println("Factorial of " + number + " is: " + resultE);
                break;
            case "SwapNodesInPairs":
                ListNode list21 = new ListNode(1);
                list21.next = new ListNode(3);
                list21.next.next = new ListNode(4);
                SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
                ListNode swappedPairs = swapNodesInPairs.swapPairs(list21);
                System.out.print("Swapped List : ");
                for (int i : swappedPairs)
                    System.out.print(i + " ");
                System.out.println();
                break;
        }
    }
}
