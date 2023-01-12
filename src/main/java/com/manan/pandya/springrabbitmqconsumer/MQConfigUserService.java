package com.manan.pandya.springrabbitmqconsumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfigUserService {
	
	public static final String USER_QUEUE="user_queue";
	public static final String EXCHANGE="message_exchange";
	public static final String USER_ROUTING_KEY="user_routingKey";
	
	
	@Bean
	public Queue queueUser()
	{
		return new Queue(USER_QUEUE);
	}
	
	@Bean
	public TopicExchange exchangeUser()
	{
		return new TopicExchange(EXCHANGE);
	}

	@Bean
	public Binding bindingUser(Queue queue, TopicExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with(USER_ROUTING_KEY);
	}
	
	@Bean
	public MessageConverter messageConverterUser()
	{
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	public AmqpTemplate templateUser(ConnectionFactory connectionFactory)
	{
		RabbitTemplate template=new RabbitTemplate(connectionFactory);
		template.setMessageConverter(messageConverterUser());
		return template;
	}

}
