package com.amigoscode._2_developers._5_methods;

import java.util.HashMap;

/**
 * Method Overloading Exercises
 *
 * Practice creating overloaded methods — multiple methods with the same name
 * but different parameter lists. Java determines which version to call based
 * on the arguments you pass.
 */
public class MethodOverloading {

    // TODO: 1 - Create a method: int add(int a, int b)
    //  Returns the sum of two integers.
    private static int add(int num1, int num2) {
        int result = num1 + num2;
         return result;
    }


    // TODO: 2 - Create an overloaded method: int add(int a, int b, int c)
    //  Returns the sum of three integers.
    private static int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;

        return sum;
    }


    // TODO: 3 - Create an overloaded method: double add(double a, double b)
    //  Returns the sum of two doubles.
    private static double add(double a, double b) {
        double doubleResult = a + b;

        return doubleResult;

    }


    // TODO: 4 - Create a method: String format(String value)
    //  Returns the string wrapped in square brackets, e.g., "[hello]".
    private static String format(String value) {
        return value;
    }

    // TODO: 5 - Create an overloaded method: String format(int value)
    //  Returns the integer formatted with leading zeros to 5 digits.
    //  Example: format(42) returns "00042".
    //  Hint: use String.format("%05d", value)
    private static String format (int value) {
        String results = String.format("%05d", value);
         return results;
    }


    // TODO: 6 - Create an overloaded method: String format(String label, int value)
    //  Returns "label: value", e.g., format("Score", 95) returns "Score: 95".
    private  static String format(String label, int value) {

        return label + ":" + value;
    }


    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        // TODO: 7 - Call each overloaded method and print the results:
        //  - add(2, 3)
        int result = add(10, 5);
        System.out.println(result);

        //  - add(1, 2, 3)
        int sum = add(2, 4, 7);
        System.out.println(sum);

        //  - add(1.5, 2.5)
        double doubleResult = add(1.5,  2.5);
        System.out.println(doubleResult);

        //  - format("hello")
        System.out.println(format("Hello"));

        //  - format(42)
        String results = format(42);
        String results2 = format(1000);
        System.out.println(results);
        System.out.println(results2);
        //  - format("Score", 95)
        System.out.println(format("Score", 98));

        //  Print each result with a descriptive label.

    }
}
