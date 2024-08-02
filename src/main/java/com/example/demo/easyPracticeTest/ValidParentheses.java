package com.example.demo.easyPracticeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    //Problem : Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //An input string is valid if:
    //
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
/*
* Intuition
* taking advantage of stack LIFO property
*
* Approach
* Iterate through each character of the string once while push, pop, & seek operations, O(n) - time
* worst case scenario is when we are only pushing opening brackets, and we have to store the whole string. O(n) - space
*
* Complexity
Time complexity:O(n)    1ms
Space complexity:O(n)   41.44MB
* */
