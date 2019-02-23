package com.mylearn.config.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        // IOC 的bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // 类加载器
        ClassLoader classLoader = context.getClassLoader();

        // 环境变量
        Environment environment = context.getEnvironment();

        // bean 定义的注册
        BeanDefinitionRegistry registry = context.getRegistry();

        if (environment.getProperty("os.name").contains("linux")) {
            return true;
        }

        return false;
    }
}
