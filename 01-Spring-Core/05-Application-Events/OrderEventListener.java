package com.shrutika.examples.core.events;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class OrderEventListener {
    @EventListener
    public void handle(OrderCreatedEvent event) {
        System.out.println("Handling order event: " + event.orderId());
    }
}
