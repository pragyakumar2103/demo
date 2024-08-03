package com.example.demo.helpingClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesesHelperClass {
    //method to get permutations of the string
    public void permute(String str, int l, int r, List<String> permutations) {
        if (l == r) {
            permutations.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, permutations);
                str = swap(str, l, i); // backtrack
            }
        }
    }
    // Method to swap characters at positions i and j in a string
    private String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public String concat(String str, int i){
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++)
            stringBuilder.append(str);
        return stringBuilder.toString();
    }
    public List<String> removeDuplicates(List<String> list){
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }


    public void generateParenthesisHelper(List<String> result, String current, int open, int close, int max) {
        // Base case: if the current string is of the desired length
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add an opening parenthesis if there are still available
        if (open < max) {
            generateParenthesisHelper(result, current + "(", open + 1, close, max);
        }

        // Add a closing parenthesis if it does not exceed the number of opening ones
        if (close < open) {
            generateParenthesisHelper(result, current + ")", open, close + 1, max);
        }
    }
}
/*
 * permute Method:This is a recursive method that generates permutations.
 * If the left index (l) is equal to the right index (r), it means a permutation has been formed, and it is added to the list.
 * Otherwise, it iterates through the substring, swapping characters and calling itself recursively with the next index.
 * swap Method:Swaps characters at positions i and j in a string and returns the new string.
 * */