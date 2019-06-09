package com.epam.homework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class ContextListenerImpl implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event.getTimestamp() + " : " + event.getApplicationContext().getDisplayName() + " started");
    }
}
