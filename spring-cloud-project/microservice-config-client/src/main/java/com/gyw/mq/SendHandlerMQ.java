package com.gyw.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SendHandlerMQ {
    /**
     * springboot会帮我们创建。
     */
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send(){
        String sendMsg = "hello " + new Date();
        System.out.println("rabbit生产者发送消息 : " + sendMsg);
        amqpTemplate.convertAndSend("spring-boot-topicExchange", "queue.demo", sendMsg); 
        //第一个参数：交换机的名字，我们在第二步，声明了topic交换机名称为spring-boot-topicExchange的交换机，因此这里写spring-boot-topicExhchange
        //第二个参数：队列的名称，我们在第二步，配置了名字为queue.demo的队列，因此这里写的是queue.demo
        //第三个参数：要发送的消息数据。
        //说明：当生成这发送数据到mq后，首先会寻找与路由键匹配的绑定模式，而我们的匹配规则是queue.#  (其中#标示0个或多个，*标示至少有一个)，因此这里发送的数据会被被queue.demo的队列消费。
    }
}