package com.shrutika.examples.core.di;
import org.springframework.stereotype.Component;
@Component
public class StripePaymentGateway implements PaymentGateway {
    public String pay(double amount) { return "Payment processed: " + amount; }
}
