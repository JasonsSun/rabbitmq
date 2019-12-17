package com.sunmq.rabbitmq.jasonproject;

import com.sunmq.rabbitmq.jasonproject.producer.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitUserTest {

    @Autowired
    private UserSender userSender;

    @RequestMapping("/userTest")
    public void userTets() {
        userSender.send();
    }
}
