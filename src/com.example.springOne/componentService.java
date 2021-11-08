package com.example.springOne;

import org.springframework.stereotype.Component;

@Component
public class componentService implements FortuneService{

    @Override
    public String getFortuneService() {
        return "Now you have all components.";
    }
}
