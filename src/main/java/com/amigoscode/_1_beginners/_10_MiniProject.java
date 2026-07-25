package com.amigoscode._1_beginners;

import java.util.Scanner;

/**
 * Mini Project: Simple Calculator
 *
 * Put together everything you have learned so far to build a simple calculator.
 * The calculator should display a menu, read the user's choice and two numbers,
 * perform the chosen operation, and print the result.
 */
public class _10_MiniProject {

     static void main() {

        // TODO: 1 - Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);


        // TODO: 2 - Display a menu with the following options:
        // Print:
        //   "=== Simple Calculator ==="
        //   "1. Add"
        //   "2. Subtract"
        //   "3. Multiply"
        //   "4. Divide"
        //   "Choose an operation (1-4): "
       String menu = """
           === Simple Calculator ===
           1. Add
           2. Subtract
           3. Multiply
           4. Divide
           Choose an operation (1-4): """;
        System.out.print(menu);


        // TODO: 3 - Read the user's choice into an int variable
        int choice = scanner.nextInt();
        /*
        String  choice = menu;

        switch (choice) {
            case  "Add":
                System.out.println(choice);
                break;
            case  "Subtract":
                System.out.println(choice);
                break;
            case  "Multiply":
                System.out.println(choice);
                break;
            case  "Divide":
                System.out.println(choice);
                break;

        }

         */


        // TODO: 4 - Prompt and read two double numbers from the user
        // Print "Enter first number: " and read it.
        // Print "Enter second number: " and read it.
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();






        // TODO: 5 - Use a switch statement to perform the chosen operation and print the result
        // Case 1: Print "Result: " + (num1 + num2)
        // Case 2: Print "Result: " + (num1 - num2)
        // Case 3: Print "Result: " + (num1 * num2)
        // Case 4: Perform division (but handle division by zero first - see TODO 6)
        // Default: Print "Invalid choice"
        //double result = num1, num2;
        switch(choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid choice");

        }

        // TODO: 6 - Inside case 4, handle division by zero with an if statement
        // If the second number is 0, print "Error: Cannot divide by zero"
        // Otherwise, print the result of the division

    }
}
