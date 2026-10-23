package com.shrutika.examples.testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PriceCalculatorTest {
    @Test void calculatesTotal() {
        assertEquals(30.0, new PriceCalculator().total(10, 3));
    }
}
