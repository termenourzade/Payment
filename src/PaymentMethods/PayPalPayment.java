package PaymentMethods;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public String getPaymentDetails() {
        return "used paypal account with the email " + email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount: " + amount + "$");
        System.out.println(getPaymentDetails());
    }
}
