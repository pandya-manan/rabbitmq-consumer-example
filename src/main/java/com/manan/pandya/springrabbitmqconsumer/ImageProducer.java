package com.manan.pandya.springrabbitmqconsumer;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;
@Component
public class ImageProducer {
	

	public File byteArrayToImage(ProductDTO dto) throws IOException
	{
		byte[] getImageBytes=dto.getProductPicture();
		System.out.println(getImageBytes.length);
		ByteArrayInputStream bis=new ByteArrayInputStream(getImageBytes);
		BufferedImage image2=ImageIO.read(bis);
		File newFile=new File("image.jpg");
		ImageIO.write(image2, "jpg", newFile);
		System.out.println("Image Created");
		return newFile;
		
	}

}
