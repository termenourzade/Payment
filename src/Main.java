import Customers.Customer;
import Customers.PremiumCustomer;
import Customers.RegularCustomer;
import PaymentMethods.BitcoinPayment;
import PaymentMethods.CreditCardPayment;
import PaymentMethods.PayPalPayment;
import PaymentMethods.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        Customer amirPre = new PremiumCustomer("amir");
        Customer matinPre = new PremiumCustomer("matin");
        Customer minaReg = new RegularCustomer("mina");

        PaymentStrategy creditCard = new CreditCardPayment("12" , "terme");
        PaymentStrategy bitcoin = new BitcoinPayment("bitcoin.wallet");
        PaymentStrategy paypal = new PayPalPayment("nameee@gmail.com");

        amirPre.displayCustomerInfo();
        matinPre.displayCustomerInfo();
        minaReg.displayCustomerInfo();
        System.out.println(" ");

        amirPre.makePayment(creditCard , 100.0);
        amirPre.makePayment(bitcoin , 50.0);
        System.out.println();
        matinPre.makePayment(bitcoin , 200.0);
        matinPre.makePayment(paypal , 100.0);
        System.out.println();
        minaReg.makePayment(paypal , 300.0);
        minaReg.makePayment(creditCard , 150.0);
        System.out.println();

        amirPre.showPaymentHistory();
        System.out.println("---------------");
        matinPre.showPaymentHistory();
        System.out.println("---------------");
        minaReg.showPaymentHistory();
    }
}