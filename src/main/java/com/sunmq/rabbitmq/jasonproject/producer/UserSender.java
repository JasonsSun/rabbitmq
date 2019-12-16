package com.sunmq.rabbitmq.jasonproject.producer;


import com.sunmq.rabbitmq.jasonproject.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSender {

    private static final Logger log = LoggerFactory.getLogger(UserSender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        User user = new User();
        user.setName("test");
        user.setPass("123456");
        log.info("user Sender:" + user.getName() + "," + user.getPass());
        amqpTemplate.convertAndSend("user", user);
    }
}
