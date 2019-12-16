//package com.sunmq.rabbitmq.OneProducerMoreConsumer;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RabbitOneToManyTest {
//
//    @Autowired
//    private HelloSender1 helloSender;
//
//    /**
//     * 方法名：
//     * 功能：单生产者-多消费者
//     */
//    @RequestMapping("/oneToMany")
//    public void ontToMany(){
//        for (int i=0;i<10;i++){
//            helloSender.send("hello smg:"+i);
//        }
//    }
//}
