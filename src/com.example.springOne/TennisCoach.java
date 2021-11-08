package com.example.springOne;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("componentService")
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("   Tennis Coach");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    //    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice Daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
