/**
 * Created by Krzysztof Zabolotny, https://github.com/KrzysztofZabolotny
 */
package com.heroku.neversleep.schedulers;

import com.heroku.neversleep.utilities.URLRecorder;
import com.heroku.neversleep.utilities.URLRequestSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
public class BaseScheduler {

    @Autowired
    URLRequestSender urlRequestSender;


    @Scheduled(cron = "0/15 * * * * *")
    public void scheduleGetRequest() throws Exception {


        urlRequestSender.sendRequests();
        System.out.println("Requests sent "+ URLRecorder.timeStamp());



    }
}
