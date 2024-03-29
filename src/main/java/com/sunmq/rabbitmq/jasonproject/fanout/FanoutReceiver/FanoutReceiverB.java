package com.sunmq.rabbitmq.jasonproject.fanout.FanoutReceiver;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {

    private static final Logger log = LoggerFactory.getLogger(FanoutReceiverB.class);

    @RabbitHandler
    public void process(String msg) {
        log.info("FanoutReceiverB  : " + msg);
    }

}
