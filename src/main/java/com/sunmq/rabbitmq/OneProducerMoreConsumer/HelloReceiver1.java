package com.sunmq.rabbitmq.OneProducerMoreConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver1 {
    private static final Logger log = LoggerFactory.getLogger(HelloReceiver1.class);

    //监听器监听指定的Queue
    @RabbitListener(queues="hello")
    public void process(String hello){
        log.info("Receiver1:"+hello);
    }

}
