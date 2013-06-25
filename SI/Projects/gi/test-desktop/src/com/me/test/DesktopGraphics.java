package com.me.test;

import buddhuram.SharedObject;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.me.test.MyTest;


public class DesktopGraphics {
	
	public static int a = 1;
	public static void main(String[] args) throws InterruptedException {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "test";
		cfg.useGL20 = true;
		cfg.width = 1000;
		cfg.height = 400;
		cfg.x=250;
		cfg.y= 70;
		 
		cfg.resizable = false;
		
		MyTest g_object=new MyTest();
		new LwjglApplication(g_object, cfg);
		
		new FrameWorkGIBDIA().startFramework();
		
		
		
		SharedObject.dummy_obj=g_object;
		
	}
}
