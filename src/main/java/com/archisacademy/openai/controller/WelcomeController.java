package com.archisacademy.openai.controller;

import com.archisacademy.openai.service.WelcomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    private final WelcomeService service;

    public WelcomeController(WelcomeService service) {
        this.service = service;
    }

    @PostMapping("/user")
    public String gratings(@RequestBody String name) {

        return service.gratings(name);
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable String name) {

        return service.gratings(name);
    }

}
