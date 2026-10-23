package com.shrutika.examples.advanced.async;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class NotificationService {
    @Async
    public void sendEmail(String recipient) {
        System.out.println("Sending email to " + recipient);
    }
}
