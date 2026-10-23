package com.shrutika.examples.boot.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class LoggingService {
    private static final Logger log = LoggerFactory.getLogger(LoggingService.class);
    public void process(String id) { log.info("Processing request id={}", id); }
}
