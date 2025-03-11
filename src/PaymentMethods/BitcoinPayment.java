package PaymentMethods;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    @Override
    public String getPaymentDetails() {
        return "used bitcoin wallet with the address " + walletAddress;
    }
    @Override
    public void pay(double amount) {
        System.out.println("amount:" + amount + "$");
        System.out.println(getPaymentDetails());
    }
}
