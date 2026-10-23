package com.shrutika.examples.jpa.transactions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class TransferService {
    @Transactional
    public void transfer(long from, long to, double amount) {
        // Debit and credit are one atomic transaction.
    }
}
