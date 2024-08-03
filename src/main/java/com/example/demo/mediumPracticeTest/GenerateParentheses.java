package com.example.demo.mediumPracticeTest;

import com.example.demo.easyPracticeTest.ValidParentheses;
import com.example.demo.helpingClasses.GenerateParenthesesHelperClass;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    //Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    public List<String> generateParenthesis(int n) {
        GenerateParenthesesHelperClass generateParenthesesHelperClass = new GenerateParenthesesHelperClass();
        ValidParentheses validParentheses = new ValidParentheses();
        List<String> validPermutations = new ArrayList<>();
        String str = "()";
        String string = generateParenthesesHelperClass.concat(str,n);
        List<String> permutations = new ArrayList<>();
        generateParenthesesHelperClass.permute(string,0,string.length()-1,permutations);
        for(String str1 : permutations) {
            if (validParentheses.isValid(str1))
                validPermutations.add(str1);
        }
        validPermutations = generateParenthesesHelperClass.removeDuplicates(validPermutations);
        return validPermutations;
    }
    public List<String> generateParenthesisA(int n) {
        List<String> result = new ArrayList<>();
        GenerateParenthesesHelperClass generateParentheses = new GenerateParenthesesHelperClass();
        generateParentheses.generateParenthesisHelper(result, "", 0, 0, n);
        return result;
    }
}
/*
* Intuition
* The problem of generating all combinations of well-formed parentheses can be tackled using a backtracking approach.
* This involves constructing the string step by step while ensuring that the parentheses are balanced at every stage.
* The recursive backtracking approach helps explore all possible valid combinations by adding either an opening or
* closing parenthesis, given that the current state remains valid.
*
* Approach
* Base Case:When the length of the current string is equal to 2 * n,
* the string is a valid combination, so add it to the result list.
* Recursive Case:If the number of opening parentheses (open) is less than n,
* add an opening parenthesis and recursively call the helper function.
* If the number of closing parentheses (close) is less than the number of opening parentheses (open),
* add a closing parenthesis and recursively call the helper function.
*
* Complexity
Time complexity:O(4^n /\ sqrt{n})    1ms
Space complexity:O(n)   43.47MB n is depth of recursion tree, recursion stack can go up to 2*n calls deep
* */

