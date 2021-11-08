package com.example.springOne;

import org.springframework.stereotype.Component;


@Component
public class TrainingService implements FortuneService{

    @Override
    public String getFortuneService() {
        return "Train daily.";
    }
}
