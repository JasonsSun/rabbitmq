package com.sunmq.rabbitmq.jasonproject.callback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CallBackSender implements  RabbitTemplate.ConfirmCallback{

    private static final Logger log = LoggerFactory.getLogger(CallBackSender.class);

    @Autowired
    private RabbitTemplate rabbitTemplatenew;

    public void send() {
        rabbitTemplatenew.setConfirmCallback(this);
        String msg="callbackSender : i am callback sender";
        log.info(msg);
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        log.info("callbackSender UUID: " + correlationData.getId());
        this.rabbitTemplatenew.convertAndSend("exchange", "topic.messages", msg, correlationData);
    }

    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        log.info("callbakck confirm: " + correlationData.getId());
    }
}
