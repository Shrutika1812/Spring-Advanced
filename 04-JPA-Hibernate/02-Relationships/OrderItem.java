package com.shrutika.examples.jpa.relationships;
import jakarta.persistence.*;
@Entity
public class OrderItem {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String productName;
    @ManyToOne(fetch=FetchType.LAZY)
    private Order order;
    public void setOrder(Order order) { this.order = order; }
}
