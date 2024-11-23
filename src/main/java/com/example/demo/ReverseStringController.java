package com.example.demo; // Укажите ваш пакет

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseStringController {

    @GetMapping("/reverse/{string}")
    public String reverseString(@PathVariable("string") String str) {
        return new StringBuilder(str).reverse().toString();
    }
}