package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Random;

@RestController
@SessionAttributes("targetNumber")
public class GuessNumberController {

    private static final int MAX_NUMBER = 100;

    @ModelAttribute("targetNumber")
    public int setUpGame() {
        return new Random().nextInt(MAX_NUMBER) + 1;
    }

    @GetMapping("/game")
    public String guessNumber(@RequestParam("n") int userGuess, @SessionAttribute("targetNumber") int targetNumber) {
        if (userGuess < targetNumber) {
            return "Ваше число меньше загаданного числа.";
        } else if (userGuess > targetNumber) {
            return "Ваше число больше загаданного числа.";
        } else {
            return "Поздравляю! Вы угадали число.";
        }
    }
}
