package com.archisacademy.openai.service.impl;

import com.archisacademy.openai.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImp implements WelcomeService {

    @Override
    public String gratings(String name) {
        return "Welcome" + name;
    }

}
