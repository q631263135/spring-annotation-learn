package com.mylearn.config;

import com.mylearn.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigByConfigurationClass {
    @Bean
    public Person person() {
        return new Person("lisi", 20);
    }

    @Bean("wangwu")
    public Person anotherPerson() {
        return new Person("wangwu", 41);
    }
}
