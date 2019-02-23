package com.mylearn.config;

import com.mylearn.bean.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import static org.junit.Assert.*;

public class BeansConfigByContionalTest {
    AnnotationConfigApplicationContext context = null;

    @Before
    public void assignTheContext() {
        context = new AnnotationConfigApplicationContext(BeansConfigByContional.class);
    }

    @Test
    public void testSimple() {
        String[] beansName = context.getBeanDefinitionNames();
        for (String beanName : beansName) {
            System.out.println(beanName);
        }

        ConfigurableEnvironment env = context.getEnvironment();
        String osName = env.getProperty("os.name");
        System.out.println(osName);
    }
}