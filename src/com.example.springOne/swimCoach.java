package com.example.springOne;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class swimCoach implements Coach{

    @Autowired
    @Qualifier("trainingService")
    private FortuneService fortuneService;

    public swimCoach() {
        System.out.println("   SwimCoach constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


//    @Autowired
//    public swimCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice breathing exercises.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
