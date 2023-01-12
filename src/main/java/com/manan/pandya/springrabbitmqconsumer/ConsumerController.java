package com.manan.pandya.springrabbitmqconsumer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired(required=true)
	private ImageProducer producer;
	
	@GetMapping("/getImage")
	public File getImage(@RequestBody ProductDTO dto) throws IOException
	{
		return producer.byteArrayToImage(dto);
	}
	
	

}
