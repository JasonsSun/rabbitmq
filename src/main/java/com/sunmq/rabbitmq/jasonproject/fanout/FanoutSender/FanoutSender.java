package com.sunmq.rabbitmq.jasonproject.fanout.FanoutSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

    private static final Logger log = LoggerFactory.getLogger(FanoutSender.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg="fanoutSender :hello i am fanout";
        log.info(msg);
        this.rabbitTemplate.convertAndSend("fanoutExchange","abcd.ee", msg);
    }
}
