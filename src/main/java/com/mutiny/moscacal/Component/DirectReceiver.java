package com.mutiny.moscacal.Component;

import com.alibaba.fastjson.JSONObject;
import com.mutiny.moscacal.dto.CalDefaultDataInfo;
import com.mutiny.moscacal.dto.CalModuleInfo;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/14 14:33
 */
@Component
public class DirectReceiver {
    @Autowired
    private CountThread countThread;
    @Autowired
    private SwitchInfo switchInfo;

    public boolean startCal(JSONObject jsonObject){
        boolean isDefault = jsonObject.getBoolean("isDefault");
        int moduleId = jsonObject.getInteger("moduleId");
        int keyFileId = jsonObject.getInteger("keyFileId");
        String keyFileUrl = jsonObject.getString("keyFileUrl");
        int fileId = jsonObject.getInteger("fileId");
        String fileUrl = jsonObject.getString("fileUrl");
        long timestamp = jsonObject.getLong("timestamp");
        String applicant = jsonObject.getString("applicant");
        String sendIp = jsonObject.getString("sendIp");
        CalDefaultDataInfo calDefaultDataInfo = null;
        CalModuleInfo calModuleInfo = null;
        try {
            if (isDefault){
                calDefaultDataInfo = switchInfo.switchDefaultData(moduleId,fileId,fileUrl,keyFileId,keyFileUrl,timestamp,sendIp,applicant);
                countThread.runDefaultData(calDefaultDataInfo);
            }
            else{
                calModuleInfo = switchInfo.switchModule(moduleId,fileId,fileUrl,keyFileId,keyFileUrl,timestamp,sendIp,applicant);
                countThread.runModule(calModuleInfo);
            }
        }catch (Exception e){
            return false;
        }
        return  true;
    }

    @RabbitListener(queues = "MoscaDirectQueue")//监听的队列名称 TestDirectQueue
    @RabbitHandler
    public void process(Message message, Channel channel) throws IOException {
        String msg = new String(message.getBody(), "UTF-8");
        String messageId = message.getMessageProperties().getMessageId();
        JSONObject jsonObject = JSONObject.parseObject(msg);
        try {
            System.out.println("消费消息：" + jsonObject);
            //消息确认
            if (countThread.canBeRun()){
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
                startCal(jsonObject);
            }
            else{
                channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
            }
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
