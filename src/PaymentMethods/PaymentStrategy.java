package PaymentMethods;

public interface PaymentStrategy {
    void pay(double payment);
    String getPaymentDetails();
}
