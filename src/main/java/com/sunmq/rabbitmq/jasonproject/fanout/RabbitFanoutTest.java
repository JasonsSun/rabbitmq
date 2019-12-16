package com.sunmq.rabbitmq.jasonproject.fanout;

import com.sunmq.rabbitmq.jasonproject.fanout.FanoutSender.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitFanoutTest {

    @Autowired
    private FanoutSender fanoutSender;

    @RequestMapping("/fanoutTest")
    public void fanoutTest() {
        fanoutSender.send();
    }
}
