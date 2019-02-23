package com.mylearn.bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansByConfigurationTest {
    @Test
    public void testClasspathLoadBean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);
    }
}