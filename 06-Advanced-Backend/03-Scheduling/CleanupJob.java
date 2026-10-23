package com.shrutika.examples.advanced.scheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class CleanupJob {
    @Scheduled(cron="0 0 * * * *")
    public void cleanupExpiredData() { System.out.println("Cleanup job executed"); }
}
