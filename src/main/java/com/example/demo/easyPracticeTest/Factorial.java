package com.example.demo.easyPracticeTest;

public class Factorial {

    // Method to calculate factorial using recursion
    public double factorial(double n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }
}
/*
* sample example of recursion
* */
