package Adapter_Currency_Converter;

public class PaymentClient {
    public void makePayment(PaymentSystem paymentSystem, double amount) {
        paymentSystem.pay(amount);
    }
}
