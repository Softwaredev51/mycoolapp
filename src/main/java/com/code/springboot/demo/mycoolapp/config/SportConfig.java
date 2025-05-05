package com.code.springboot.demo.mycoolapp.config;

import com.code.springboot.demo.mycoolapp.common.Coach;
import com.code.springboot.demo.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aqua")
    public Coach swimmerCoach(){
        return new SwimCoach();
    }
}
