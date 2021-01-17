package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;


@Configuration
@EnableScheduling
@ComponentScan("com.company")
public class SpringConfig {
    @Bean
    public Scheduler scheduler() {
        return new Scheduler();
    }

    @Bean
    public TaskScheduler TaskScheduler() {
        return new ConcurrentTaskScheduler();
    }
}
