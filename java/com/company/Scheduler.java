package com.company;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

    @Scheduled(cron = "*/1 * * * * *")
    public void showTime() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        System.out.println(format.format(new Date(System.currentTimeMillis())));
    }
    @Scheduled(cron = "*/5 * * * * *")
    public void showMessage() {
        System.out.println("It`s current time");
    }
}
