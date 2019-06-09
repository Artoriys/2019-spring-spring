package com.epam.homework.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bean3 {

    @PostConstruct
    public void init() {
        System.out.println("bean3 is constructed");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("bean3 is destroying");
    }

    public String doSomeLogic(String a) {
        String b ="Doing logic " + a;
        System.out.println(b);
        return b;
    }
}
