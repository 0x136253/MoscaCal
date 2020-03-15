package com.mutiny.moscacal.Component;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import java.io.IOException;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/14 14:33
 */
@Component
public class DirectReceiver {


    
    @RabbitListener(queues = "MoscaDirectQueue")//监听的队列名称 TestDirectQueue
    @RabbitHandler
    public void process(Message message, Channel channel) throws IOException {
        String msg = new String(message.getBody(), "UTF-8");
        String messageId = message.getMessageProperties().getMessageId();
        JSONObject jsonObject = JSONObject.parseObject(msg);
        try {
            //消息确认
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
            System.out.println("消费消息：" + jsonObject);
        }catch (Exception e){
            //失败后消息被确认,
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
            // channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);失败后消息重新放回队列
            // 丢弃该消息
            //channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
            System.out.println("签收失败:" + jsonObject);
        }
    }

}
