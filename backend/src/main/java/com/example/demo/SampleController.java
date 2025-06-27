package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/data")
    public Map<String, Object> getData() {
        return Map.of(
                "message", "Hello from Spring Boot",
                "items", List.of("item1", "item2", "item3")
        );
    }
}
