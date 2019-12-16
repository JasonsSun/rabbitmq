package com.sunmq.rabbitmq.jasonproject.fanout.FanoutReceiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {

    private static final Logger log = LoggerFactory.getLogger(FanoutReceiverC.class);

    @RabbitHandler
    public void process(String msg) {
        log.info("FanoutReceiverC  : " + msg);
    }

}
