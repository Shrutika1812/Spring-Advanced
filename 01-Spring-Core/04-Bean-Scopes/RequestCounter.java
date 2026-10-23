package com.shrutika.examples.core.scopes;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class RequestCounter {
    private int count;
    public int increment() { return ++count; }
}
