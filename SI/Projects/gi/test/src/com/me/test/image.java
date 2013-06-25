package com.me.test;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class image {
	private String text;
	BufferedImage imgs[] ;
	Values val[];
	public image(String text)
	{
		this.text = text;
		this.val = new Values[text.length()];
		this.imgs = new BufferedImage[text.length()];
	}
	public void createImage() throws IOException
	{
		image img = new image(this.text);
		img.parsetext();
		img.splitImages();
		img.mergeImages();
	}
	private void mergeImages() throws IOException {
		merge merger = new merge();
		merger.concatenate(imgs, val, text);
		
	}
	private void splitImages() throws IOException {
		split splitter = new split();
		int i=0;
		while(i<text.length())
		{
			imgs[i] = splitter.extract(val[i]);
			i++;
		}
		
	}
	public void parsetext() throws FileNotFoundException
	{
		parse parser = new parse();
		char[] charArray = text.toCharArray();
		int i=0;
		while(i<text.length())
		{
			val[i] = parser.getValues(charArray[i]);
			i++;
		}
	}

}
