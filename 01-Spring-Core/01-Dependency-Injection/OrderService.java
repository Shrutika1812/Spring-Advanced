package com.shrutika.examples.core.di;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
    private final PaymentGateway gateway;
    public OrderService(PaymentGateway gateway) { this.gateway = gateway; }
    public String placeOrder(double amount) { return gateway.pay(amount); }
}
