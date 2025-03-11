package PaymentMethods;

public class CreditCardPayment implements PaymentStrategy {
    public String cardNumber;
    public String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String getPaymentDetails() {
        return "used credit card with the number: " + cardNumber + " in the name :" + cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount: " + amount + "$");
        System.out.println(getPaymentDetails());
    }
}
