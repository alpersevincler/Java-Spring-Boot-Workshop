package com.archisacademy.openai.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @PostMapping("/user")
    public String gratings(@RequestBody String name) {
        // for now
        return null;
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable String name) {
        // for now
        return null;
    }

}
