package com.epam.homework;

import com.epam.homework.beans.Bean1;
import com.epam.homework.beans.Bean2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor");
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        registry.registerBeanDefinition("bean2", BeanDefinitionBuilder.genericBeanDefinition(Bean2.class)
        .addConstructorArgValue(1).addConstructorArgValue("Ololo").getBeanDefinition());

        registry.registerBeanDefinition("bean2test", BeanDefinitionBuilder.genericBeanDefinition(Bean2.class)
                .addConstructorArgValue(1).addConstructorArgValue("Ololo").getBeanDefinition());
    }
}
