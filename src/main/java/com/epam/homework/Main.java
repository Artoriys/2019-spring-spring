package com.epam.homework;

import com.epam.homework.beans.Bean1;
import com.epam.homework.beans.Bean2;
import com.epam.homework.beans.Bean3;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.epam.homework", "com.epam.homework.beans");
        applicationContext.getBean("bean1", Bean1.class).sayHello();
        applicationContext.getBean(Bean1.class).sayHello();
        System.out.println(applicationContext.getBean("bean2" ,Bean2.class).getName());
        System.out.println(applicationContext.getBean("bean2test", Bean2.class).getName());
        System.out.println(applicationContext.getBean(Bean3.class).hashCode());

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Bean3.class);
        enhancer.setCallback((FixedValue) () -> "I'm am a proxy");
        Bean3 bean3 = (Bean3) enhancer.create();

        String b = bean3.doSomeLogic("Logic");
        System.out.println(b);
        applicationContext.close();
    }
}
