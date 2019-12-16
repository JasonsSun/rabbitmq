//package com.sunmq.rabbitmq.MorePorducerMoreConsumer;
//
//import com.sunmq.rabbitmq.MorePorducerMoreConsumer.producer.HelloSenderA;
//import com.sunmq.rabbitmq.MorePorducerMoreConsumer.producer.HelloSenderB;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RabbitManyToManyTest {
//
//    @Autowired
//    private HelloSenderA helloSenderA;
//
//    @Autowired
//    private HelloSenderB helloSenderB;
//
//    /**
//     * 方法名：
//     * 功能：多生产者-多消费者
//     * 描述：
//     */
//    @RequestMapping("/manyToMany")
//    public void ontToMany(){
//        for (int i=0;i<10;i++){
//            helloSenderA.send("hello smg:"+i);
//            helloSenderB.send("hello smg:"+i);
//        }
//    }
//}
