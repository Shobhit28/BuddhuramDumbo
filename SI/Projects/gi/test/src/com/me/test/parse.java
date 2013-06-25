package com.me.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class parse {
	String temp;
	File file = new File("res/default.fnt");
	
	public parse() throws FileNotFoundException
	{
	}
	public Values getValues(char character) throws FileNotFoundException
	{
		boolean found= false;
		Scanner scanner = new Scanner (file);
		Values v = new Values();
		while(scanner.hasNext() && !found)
		{
			if(!scanner.next().matches("char"))
			{
				scanner.nextLine();
			}
			else
			{
				scanner.findInLine("id=");
				temp = scanner.next();
				v.setId(Integer.parseInt(temp));
				
				if(v.getId()==character)
				{
					scanner.findInLine("x=");
					v.setX(Integer.parseInt(scanner.next()));
					scanner.findInLine("y=");
					v.setY(Integer.parseInt(scanner.next()));
					scanner.findInLine("width=");
					v.setWidth(Integer.parseInt(scanner.next()));
					scanner.findInLine("height=");
					v.setHeight(Integer.parseInt(scanner.next()));
					scanner.findInLine("xoffset=");
					v.setXoffset(Integer.parseInt(scanner.next()));
					scanner.findInLine("yoffset=");
					v.setYoffset(Integer.parseInt(scanner.next()));
					scanner.findInLine("xadvance=");
					v.setXadvance(Integer.parseInt(scanner.next()));
					found = true;
				}
				if(v.getId()==' ')
				{
					v.setX(0);
					v.setY(90);
					v.setWidth(15);
					v.setHeight(15);
				}
				scanner.nextLine();
				
			}
		}
		scanner.close();
		return v;
	}
}
