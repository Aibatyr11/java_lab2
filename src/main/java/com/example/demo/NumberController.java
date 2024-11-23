package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

@RestController
public class NumberController {

    @GetMapping("/api")
    public List<Integer> getNumbers(@RequestParam("q") int n) {
        return IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
    }
}
