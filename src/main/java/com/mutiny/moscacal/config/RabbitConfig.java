package com.mutiny.moscacal.config;

/**
 * @Author: Anonsmd
 * @Date: 2020/3/14 14:31
 */

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Configuration
public class RabbitConfig {
    //队列 起名：MoscaDirectQueue
    @Bean
    public Queue MoscaDirectQueue() {
        return new Queue("MoscaDirectQueue",true);  //true 是否持久
    }

    //Direct交换机 起名：MoscaDirectExchange
    @Bean
    DirectExchange MoscaDirectExchange() {
        return new DirectExchange("MoscaDirectExchange");
    }

    //绑定  将队列和交换机绑定, 并设置用于匹配键：MoscaDirectRouting
    @Bean
    Binding bindingDirect() {
        return BindingBuilder.bind(MoscaDirectQueue()).to(MoscaDirectExchange()).with("MoscaDirectRouting");
    }
}