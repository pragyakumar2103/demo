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

