package com.mylearn.config;

import com.mylearn.bean.Buildings;
import com.mylearn.bean.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansConfigScopeTest {
    AnnotationConfigApplicationContext context = null;

    @Before
    public void assignTheContext() {
        context = new AnnotationConfigApplicationContext(BeansConfigScope.class);
    }

    @Test
    public void testSingleton() {
        Person person = (Person) context.getBean(Person.class);
        Person person1 = (Person) context.getBean(Person.class);

        System.out.println(person == person1);
    }

    @Test
    public void testProtoType() {
        Buildings b1 = (Buildings) context.getBean("greatWall");
        Buildings b2 = (Buildings) context.getBean("greatWall");

        System.out.println(b1 == b2);
    }
}