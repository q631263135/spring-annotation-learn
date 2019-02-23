package com.mylearn.config;

import com.mylearn.bean.Buildings;
import com.mylearn.bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfigScope {
    @Bean
    public Person person() {
        return new Person("zhaosi", 9);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name="greatWall")
    public Buildings greatWalls() {
        return new Buildings("一条长城");
    }
}
