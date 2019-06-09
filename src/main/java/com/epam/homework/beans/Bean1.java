package com.epam.homework.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bean1 {
    private Bean2 bean2;

    @Autowired
    public Bean1(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public void sayHello() {
        System.out.println(bean2.getId() + " : " +  bean2.getName());
    }

    @PostConstruct
    public void init() {
        System.out.println("bean1 is constructed");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("bean1 is destroying");
    }
}
