package com.shrutika.examples.boot.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix="service")
public record ServiceProperties(String name, int timeoutSeconds) {}
