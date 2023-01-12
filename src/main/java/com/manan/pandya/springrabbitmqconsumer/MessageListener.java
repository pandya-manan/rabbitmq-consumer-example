package com.manan.pandya.springrabbitmqconsumer;

import java.io.IOException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
	
	@Autowired
	private ImageProducer producer;
	
//	@RabbitListener(queues=MQConfig.QUEUE)
//	public void listener(ProductDTO product)
//	{
//		System.out.println(product);
//	
//	}
	
	@RabbitListener(queues=MQConfigUserService.USER_QUEUE)
	public void secondListener(ProductDTO product)
	{
		System.out.println("Second listener"+product);
	}
}
