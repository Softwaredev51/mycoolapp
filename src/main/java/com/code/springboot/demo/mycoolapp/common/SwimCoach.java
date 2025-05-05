package com.code.springboot.demo.mycoolapp.common;

public class SwimCoach implements Coach{
//    public SwimCoach(){
//        System.out.println("In Constructor "+getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout() {
        return "Swim Daily";
    }
}
