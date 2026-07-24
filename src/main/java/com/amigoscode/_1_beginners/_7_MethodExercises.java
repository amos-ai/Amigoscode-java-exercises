package com.amigoscode._1_beginners;

import org.w3c.dom.ls.LSOutput;

/**
 * Exercise: Methods
 *
 * Learn how to define and call methods in Java.
 * Methods allow you to organize code into reusable blocks, each performing a specific task.
 */
public class _7_MethodExercises {



    // TODO: 1 - Create a method called greet that takes a String parameter 'name'
    // and prints "Hello, {name}!"
    // Hint: public static void greet(String name) { ... }
    public static void greet(String name) {
        System.out.println("Hello " + name);
        
    }


    // TODO: 2 - Create a method called add that takes two int parameters (a, b)
    // and returns their sum
    // Hint: public static int add(int a, int b) { ... }
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;

    }


    // TODO: 3 - Create a method called isEven that takes an int parameter 'number'
    // and returns true if the number is even, false otherwise
    // Hint: Use the modulus operator (%)
    public static boolean isEven( int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // TODO: 4 - Create a method called max that takes two int parameters (a, b)
    // and returns the larger of the two
    // Hint: Use an if statement or the ternary operator
    public static int max (int a, int b) {
         if (a > b) {
             return a;
         } else {
             return b;
         }

    }


    // TODO: 5 - Create a method called factorial that takes an int parameter 'n'
    // and returns n! (n factorial) using a loop
    // Hint: 5! = 5 * 4 * 3 * 2 * 1 = 120. Use a long return type for larger values.
    public static int factorial (int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
            return result;
    }


    // TODO: 6 - Create two overloaded methods called multiply:
    //   - One that takes 2 int parameters and returns their product
    //   - One that takes 3 int parameters and returns their product
    // Overloading means having multiple methods with the same name but different parameters.
    public static int multiply(int n1, int n2) {
        int total = n1 * n2;
        return total;
    }
    public static int multiply(int n1, int n2, int n3) {
        int total2 = n1 * n2 * n3;
        return total2;
    }







        // TODO: 7 - Call all the methods above and print their results
        // - Call greet with your name
        // - Call add with two numbers and print the result
        // - Call isEven with a number and print whether it is even
        // - Call max with two numbers and print the larger one
        // - Call factorial with 5 and print the result
        // - Call both multiply methods and print their results

    public static void main(String[] args) {
        greet("Shad");

        int result = add(2, 6);
        System.out.println(result);

        System.out.println(isEven(25));

        System.out.println(max(25, 9));

        System.out.println(factorial(7));

        System.out.println(multiply(3, 4));

        System.out.println(multiply(3, 5, 6));



    }
}
