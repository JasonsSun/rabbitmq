package com.sunmq.rabbitmq.jasonproject.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class CallBackReceiver {

    private static final Logger log = LoggerFactory.getLogger(CallBackReceiver.class);

    @RabbitHandler
    public void process(String msg) {
        log.info("CallBackReceiver : " +msg);
    }

}
