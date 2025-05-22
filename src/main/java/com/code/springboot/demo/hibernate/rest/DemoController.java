package com.code.springboot.demo.hibernate.rest;

import com.code.springboot.demo.hibernate.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define private field for dependency
    private Coach myCoach;
    private Coach anotherCoach;
    //define a constructor for dependency Injection
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach){
//        System.out.println("In Constructor "+getClass().getSimpleName());
//        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
//    }

    //setter injection
    @Autowired
    public void setCoach(@Qualifier("aqua") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkbeanscope(){
        return "Comparing Beans myCoach = anotherCoach ," + (myCoach == anotherCoach) ;
    }
}
