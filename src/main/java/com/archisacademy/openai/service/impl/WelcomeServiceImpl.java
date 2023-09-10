package com.archisacademy.openai.service.impl;

import com.archisacademy.openai.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public String gratings(String name) {
        return "Welcome" + name;
    }

}
