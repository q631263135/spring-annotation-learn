package com.mylearn.config;

import com.mylearn.bean.Person;
import com.mylearn.config.condition.LinuxCondition;
import com.mylearn.config.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeansConfigByContional {
    @Bean("bill")
    @Lazy
    @Conditional(WindowsCondition.class)
    public Person bill() {
        System.out.println("bill created");
        return new Person("Bill Gates", 64);
    }

    @Bean("linus")
    @Conditional(LinuxCondition.class)
    public Person linus() {
        System.out.println("linus created");
        return new Person("Linus Torvalds", 50);
    }

}
