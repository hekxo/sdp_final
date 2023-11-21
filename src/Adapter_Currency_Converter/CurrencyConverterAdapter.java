package Adapter_Currency_Converter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverterAdapter implements PaymentSystem {
    private final ForeignPaymentSystemInterface foreignPaymentSystem;
    private final Map<String, Double> exchangeRates;

    public CurrencyConverterAdapter(ForeignPaymentSystemInterface foreignPaymentSystem) {
        this.foreignPaymentSystem = foreignPaymentSystem;
        this.exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 458.63);
    }

    @Override
    public void pay(double amount) {
        double amountInTenge = amount * exchangeRates.get("USD");
        foreignPaymentSystem.makePayment(amountInTenge, "KZT");
    }
}
