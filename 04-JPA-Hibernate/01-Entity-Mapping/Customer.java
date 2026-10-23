package com.shrutika.examples.jpa.mapping;
import jakarta.persistence.*;
@Entity
public class Customer {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    protected Customer() {}
    public Customer(String name) { this.name = name; }
    public Long getId() { return id; }
}
