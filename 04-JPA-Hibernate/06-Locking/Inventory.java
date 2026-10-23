package com.shrutika.examples.jpa.locking;
import jakarta.persistence.*;
@Entity
public class Inventory {
    @Id private Long productId;
    private int quantity;
    @Version private long version;
}
