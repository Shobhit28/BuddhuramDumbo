package com.me.test;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

 public class split {
	 public BufferedImage extract(Values v) throws IOException {
		 File file = new File("res/default.png");
		 FileInputStream fis = new FileInputStream(file);
		 BufferedImage image = ImageIO.read(fis);
		 BufferedImage splitted;
			 splitted = new BufferedImage(v.getWidth(),v.getYoffset() +v.getHeight(), image.getType());
			 Graphics2D gr = splitted.createGraphics();
			 gr.drawImage(image,0,v.getYoffset(), v.getWidth(),v.getYoffset()+v.getHeight(), v.getX(),v.getY(), v.getX()+v.getWidth(),v.getY()+v.getHeight(), null);
			 gr.dispose();
			 return splitted;
	 }
 }