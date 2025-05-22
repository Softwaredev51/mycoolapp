package com.code.springboot.demo.hibernate.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach{
//    public CricketCoach(){
//        System.out.println("In Constructor "+getClass().getSimpleName());
//    }
//    @PostConstruct
//    public void doMyStartUpStuff(){
//        System.out.println("In doMyStartUpStuff "+getClass().getSimpleName());
//    }
//    @PreDestroy
//    public void doMyCleanUpStuff(){
//        System.out.println("In doMyCleanUpStuff "+getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout(){
        return "Practice Cricket 15 minutes !!";
    }
}
