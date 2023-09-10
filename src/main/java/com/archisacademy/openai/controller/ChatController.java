package com.archisacademy.openai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chat")
public class ChatController {

    @PostMapping("/prompt")
    public String prompt(@RequestBody String prompt) {
        // for now
        return null;
    }

}
