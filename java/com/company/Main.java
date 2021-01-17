package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Scheduler scheduler = context.getBean(Scheduler.class);
        scheduler.showMessage();
        scheduler.showTime();
    }
}
