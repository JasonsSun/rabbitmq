//package com.sunmq.rabbitmq.MorePorducerMoreConsumer.consumer;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HelloReceiverB {
//
//    private static final Logger log = LoggerFactory.getLogger(HelloReceiverB.class);
//
//    //监听器监听指定的Queue
//    @RabbitListener(queues="hello")
//    public void process(String hello){
//        log.info("ReceiverB:"+hello);
//    }
//
//}
