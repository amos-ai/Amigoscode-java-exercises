package com.amigoscode._1_beginners;

import java.lang.reflect.Array;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class _3_TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int grade = 99;
        double bestGrade = grade;

        System.out.println(grade);
        System.out.println(bestGrade);



        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        double score = 9.78;
        int totalScore = (int) score;

        System.out.println(score);
        System.out.println(totalScore);


        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.

        int number = 109;
        char charRep = (char) number;

        System.out.println(number);
        System.out.println(charRep);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char charr = 'S';
        int numRep = charr;

        System.out.println(charr);
        System.out.println(numRep);



        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String strNum = "42";
        int convert = Integer.parseInt(strNum);

        System.out.println(convert);


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int num = 42;
        String converStr = String.valueOf(num);

        System.out.println(converStr);

    }
}
