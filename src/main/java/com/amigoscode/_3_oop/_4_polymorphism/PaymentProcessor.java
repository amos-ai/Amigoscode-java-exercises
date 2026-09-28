package com.amigoscode._3_oop._4_polymorphism;

import java.util.ArrayList;
import java.util.List;


// TODO: 2 - Create a CreditCardPayment class that implements Payment.
//   - Add a private field: cardNumber (String)
//   - Create a constructor that takes the cardNumber
//   - Implement processPayment() to print:
//     "Processing credit card payment of $<amount> with card <cardNumber>"
//     and return true
//   - Implement getPaymentMethod() to return "Credit Card"
class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment (String cardNumber) {
        this.cardNumber = cardNumber;
    }


    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing credit card payment of %s with card %s ", amount, cardNumber );
        return false;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}


// TODO: 3 - Create a PayPalPayment class that implements Payment.
//   - Add a private field: email (String)
//   - Create a constructor that takes the email
//   - Implement processPayment() to print:
//     "Processing PayPal payment of $<amount> from <email>"
//     and return true
//   - Implement getPaymentMethod() to return "PayPal"
class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing PayPal payment of %s from %s ", amount, email);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}


// TODO: 4 - Create a BankTransferPayment class that implements Payment.
//   - Add a private field: bankAccountId (String)
//   - Create a constructor that takes the bankAccountId
//   - Implement processPayment() to print:
//     "Processing bank transfer of $<amount> from account <bankAccountId>"
//     and return true
//   - Implement getPaymentMethod() to return "Bank Transfer"
class BankTransferPayment implements Payment {
    private String bankAccountId;

    public BankTransferPayment(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Processing bank transfer of %s from account %s ", amount, bankAccountId);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }
}


// TODO: 5 - Create a PaymentProcessor class with a method:
//   void processAllPayments(List<Payment> payments, double amount)
//   Iterate over the list and call processPayment(amount) on each.
//   After each payment, call printReceipt(amount).
class PaymentProcessor {

    void processAllPayments(List<Payment> payments, double amount) {
        for ( Payment pm : payments) {
             pm.processPayment(amount);
             pm.printReceipt(amount);
        }

    }
}


class PaymentDemo {
    public static void main(String[] args) {
        // TODO: 6 - Create a List<Payment> containing one of each payment type:
        //   CreditCardPayment, PayPalPayment, BankTransferPayment.
        //   Then create a PaymentProcessor and call processAllPayments().
        List<Payment> payments = new ArrayList<>();
        CreditCardPayment ceditCard = new CreditCardPayment("12345-6789");
        PayPalPayment payPal = new PayPalPayment("payer@mail.com");
        BankTransferPayment bankTransfer = new BankTransferPayment("ID101");

        payments.add(ceditCard);
        payments.add(payPal);
        payments.add(bankTransfer);

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processAllPayments(payments, 100);

        



        // TODO: 7 - Demonstrate runtime polymorphism:
        //   Create a Payment variable and assign different implementations to it.
        //   Call processPayment() each time and observe that the correct
        //   implementation runs based on the actual object type.
        //   Example:
        //     Payment payment = new CreditCardPayment("1234-5678");
        //     payment.processPayment(100.0);
        //     payment = new PayPalPayment("user@email.com");
        //     payment.processPayment(200.0);
        Payment payment = new CreditCardPayment("2468-13579");
        payment.processPayment(1000);
        payment = new PayPalPayment("pay@paypal.com");
        payment.processPayment(500);
        payment = new BankTransferPayment("ID202");
        payment.processPayment(200);

    }
}
