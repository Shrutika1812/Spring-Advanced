package com.shrutika.examples.rest.dto;
import jakarta.validation.constraints.*;
public record ProductRequest(@NotBlank String name, @Positive double price, @Min(0) int stock) {}
