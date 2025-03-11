package Customers;

import PaymentMethods.PaymentStrategy;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentDetails = amount + " paid" + "\n" + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentDetails);

    }

    public void showPaymentHistory() {
        System.out.println(name + "'s payment history: ");
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }

    }
}
