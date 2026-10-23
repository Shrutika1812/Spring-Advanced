package com.shrutika.examples.core.lifecycle;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class AuditClient {
    @PostConstruct void connect() { System.out.println("Audit client initialized"); }
    @PreDestroy void close() { System.out.println("Audit client closed"); }
}
