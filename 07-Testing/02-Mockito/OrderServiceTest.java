package com.shrutika.examples.testing.mockito;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class OrderServiceTest {
    interface PaymentGateway { void charge(double amount); }
    @Test void verifiesInteraction() {
        PaymentGateway gateway = mock(PaymentGateway.class);
        gateway.charge(100);
        verify(gateway).charge(100);
    }
}
