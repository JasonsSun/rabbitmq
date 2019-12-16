package com.sunmq.rabbitmq.jasonproject.callback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitCallBackTest {

    @Autowired
    private CallBackSender callBackSender;

    //执行代码可以看出callbackSender发出的UUID，收到了回应，又传回来了。
    @RequestMapping("/callback")
    public void callbak() {
        callBackSender.send();
    }
}
