package Adapter_Currency_Converter;

public interface ForeignPaymentSystemInterface {
    void makePayment(double amount, String currency);
}
