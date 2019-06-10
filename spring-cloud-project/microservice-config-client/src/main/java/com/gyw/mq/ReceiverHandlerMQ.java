package com.gyw.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
/**
 * 这里写的是监听的是哪个队列。
 */
@RabbitListener(queues = "queue.demo")
public class ReceiverHandlerMQ {
    @RabbitHandler
    public void process(String message) {
        System.out.println("接受端  : " + message);
    }
}