package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomNumberController {

    @GetMapping("/random_number")
    public int getRandomNumber() {
        return new Random().nextInt(500) + 1;
    }
}
