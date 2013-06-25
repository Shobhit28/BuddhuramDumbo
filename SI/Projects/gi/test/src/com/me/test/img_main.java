package com.me.test;

import java.io.IOException;

public class img_main {

	public static void main(String[] args)
	{
		image img=new image("qwerty");
		try {
			img.createImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("image created");
	}
}
