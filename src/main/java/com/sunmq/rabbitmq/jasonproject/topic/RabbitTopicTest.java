package com.sunmq.rabbitmq.jasonproject.topic;

import com.sunmq.rabbitmq.jasonproject.topic.TopicSender.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitTopicTest {

    @Autowired
    private TopicSender topicSender;

    @RequestMapping("/topicTest")
    public void topicTest() {
        topicSender.send();
    }
}
