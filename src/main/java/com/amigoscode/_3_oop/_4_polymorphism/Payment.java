package com.amigoscode._3_oop._4_polymorphism;

/**
 * Exercise: Polymorphism - Payment Processing
 *
 * Build a payment processing system using interfaces and polymorphism.
 * Multiple payment methods implement the same interface, allowing
 * the processor to handle any payment type without knowing the details.
 *
 * Key concepts:
 * - Defining interfaces
 * - Multiple classes implementing the same interface
 * - Runtime polymorphism (method dispatch)
 * - Programming to an interface, not an implementation
 * - Default methods in interfaces
 */

// TODO: 1 - Create a Payment interface with:
//   - A method: boolean processPayment(double amount)
//   - A method: String getPaymentMethod()
//   - A default method: void printReceipt(double amount) that prints:
//     "Receipt: $<amount> paid via <getPaymentMethod()>"
//     Default methods provide a body in the interface itself.
interface Payment {
        
        boolean processPayment(double amount);
        
        String getPaymentMethod();
        
        default void printReceipt(double amount ) {
            System.out.printf("$%s paid via %s ", amount, getPaymentMethod() + "\n");
        }
}
