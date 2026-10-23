package com.shrutika.examples.advanced.idempotency;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.stereotype.Component;
@Component
public class IdempotencyKeyStore {
    private final ConcurrentMap<String, Boolean> processed = new ConcurrentHashMap<>();
    public boolean alreadyProcessed(String key) {
        return processed.putIfAbsent(key, Boolean.TRUE) != null;
    }
}
