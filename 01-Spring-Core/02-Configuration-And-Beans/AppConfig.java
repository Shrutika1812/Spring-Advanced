package com.shrutika.examples.core.config;
import java.time.Clock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    Clock systemClock() { return Clock.systemUTC(); }
}
