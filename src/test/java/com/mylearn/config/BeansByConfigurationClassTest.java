package com.mylearn.config;

import com.mylearn.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansByConfigurationClassTest {

    /**
     * 因为在MainConfig中配置了两个Person，这段代码会报错
     */
    @Test
    public void testNoQualifyBeanError() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfigByConfigurationClass.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void testGetBeanByName() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfigByConfigurationClass.class);
        Person person = (Person) applicationContext.getBean("wangwu");
        Person person2 = (Person) applicationContext.getBean("wangwu");
        System.out.println(person);
        System.out.println(person == person2);
    }
}
