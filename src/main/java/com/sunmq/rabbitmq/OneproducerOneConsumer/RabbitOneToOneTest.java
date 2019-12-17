package com.sunmq.rabbitmq.OneproducerOneConsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitOneToOneTest {

    @Autowired
    private HelloSender helloSender;

    /**
     * 单生产者-单消费者
     */
    @RequestMapping("/hello")
    public void hello(){
        helloSender.send();
    }
}
