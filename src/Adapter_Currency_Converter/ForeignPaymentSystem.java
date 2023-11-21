package Adapter_Currency_Converter;

public class ForeignPaymentSystem implements ForeignPaymentSystemInterface {
    @Override
    public void makePayment(double amount, String currency) {
        System.out.println("Payment of " + amount + " " + currency + " processed.");
    }
}
