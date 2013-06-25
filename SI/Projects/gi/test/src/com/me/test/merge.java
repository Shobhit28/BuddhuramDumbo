package com.me.test;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class merge {      
	

	public void concatenate(BufferedImage[] imgs, Values[] v, String text) {
		int type;
        type = imgs[0].getType(); 
        int totalWidth=0;
        int currentWidth = 0;
        int totalHeight=0;
        int i=0;
        while(i<text.length())
        {
        	totalWidth = totalWidth + v[i].getWidth();
        	if(totalHeight < v[i].getHeight()+v[i].getYoffset())
        	{
        		totalHeight = v[i].getHeight()+v[i].getYoffset();
        	}
        	i++;
        }
        BufferedImage finalImg = new BufferedImage(totalWidth, totalHeight, type);
        for (i = 0; i < text.length(); i++)
        {
        	
                finalImg.createGraphics().drawImage(imgs[i], currentWidth, 0, null);  
                currentWidth = currentWidth + v[i].getWidth();
        } 
        AffineTransform transform = new AffineTransform();
        //transform.translate(finalImg.getHeight(),finalImg.getWidth());
        transform.rotate(Math.toRadians(-90));
        transform.translate(-finalImg.getWidth(),0);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
        finalImg = op.filter(finalImg, null);
        AffineTransform tx = AffineTransform.getScaleInstance(1, -1);
        tx.translate(0, -finalImg.getHeight(null));
        AffineTransformOp op1 = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        finalImg = op1.filter(finalImg, null);
        System.out.println("Image concatenated.....");
        try {
			ImageIO.write(finalImg, "png", new File("../test-desktop/bin/data/one.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
	}
}