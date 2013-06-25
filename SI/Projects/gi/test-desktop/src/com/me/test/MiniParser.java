package com.me.test;
import java.util.*;
public class MiniParser {
	String extract;
	String[] splitExtract1;
	String[] splitExtract2;
	String[] splitExtract3;
	String[] splitExtract4;
	String[] splitExtract5;
	String[] splitExtract6;
	String[] splitExtract7;
	String[] splitExtract8;
	String[] splitExtract9;
	String[] codeInStatements;
	int line_number;
	int length;
	
	public MiniParser(String str)
	{
		this.extract=str;
		this.line_number=0;
			
	}
	public void split()
	{
			
			splitExtract1 = extract.split("(?<=;)");
			
	}
	public void comeon()
	{
		String[] temp;	
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<splitExtract1.length;i++)
		{	
			temp=splitExtract1[i].split("\\{");
			for(int j=0;j<temp.length;j++)
			{
				al.add(temp[j]);
				
				
				if(j!=temp.length-1)
				{
					al.add("{");
				}
			}
			
				
		}
		splitExtract2 = new String[al.size()];
		splitExtract2=al.toArray(splitExtract2);
		al.clear();
		for(int i=0;i<splitExtract2.length;i++)
		{
			temp=splitExtract2[i].split("\\}");
			for(int j=0;j<temp.length;j++)
			{
				al.add(temp[j]);
				
				
				if(j!=temp.length-1)
				{
					al.add("}");
				}
			}
		}
		splitExtract3 = new String[al.size()];
		splitExtract3=al.toArray(splitExtract3);
		al.clear();
		doit(splitExtract3);
				
	}
	public void doit(String str[])
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			String temp=str[i];
			//int start=0;
			while(temp.contains("if ")||temp.contains("if("))
			{
				int if_start,type,next_start;
				if(temp.contains("if "))
				{
					if_start=temp.indexOf("if ");
					//type=0;
				}
				else
				{
					if_start=temp.indexOf("if(");
					//type=1;
				}
				next_start=bracketfinder(temp.substring(if_start),2);
				al.add(temp.substring(0,if_start+next_start));
				temp=temp.substring(if_start+next_start);
				//System.out.println(temp);
				
			}
			if(!temp.equals("null"))
			al.add(temp);
		}
		splitExtract4 = new String[al.size()];
		splitExtract4=al.toArray(splitExtract4);
		al.clear();
		for(int i=0;i<splitExtract4.length;i++)
		{
			String temp=splitExtract4[i];
			//int start=0;
			while(temp.contains("while ")||temp.contains("while("))
			{
				int while_start,type,next_start;
				if(temp.contains("while "))
				{
					while_start=temp.indexOf("while ");
					//type=0;
				}
				else
				{
					while_start=temp.indexOf("while(");
					//type=1;
				}
				next_start=bracketfinder(temp.substring(while_start),5);
				al.add(temp.substring(0,while_start+next_start));
				temp=temp.substring(while_start+next_start);
				//System.out.println(temp);
				
			}
			if(!temp.equals("null"))
			al.add(temp);
		}
		splitExtract5 = new String[al.size()];
		splitExtract5=al.toArray(splitExtract5);
		al.clear();
		elseDoSplitter(splitExtract5);
	}
	public void elseDoSplitter(String[] str)
	{
		String temp[];
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			temp=str[i].split("do ");
			for(int j=0;j<temp.length;j++)
			{
				al.add(temp[j]);
				
				
				if(j!=temp.length-1)
				{	
					al.add("do");
				}
			}
		}
		splitExtract6 = new String[al.size()];
		splitExtract6=al.toArray(splitExtract6);
		al.clear();
		String temp1;
		for(int i=0;i<splitExtract6.length;i++)
		{
			temp1=splitExtract6[i];
			if(temp1.contains("else "))
			{
				int pos=temp1.indexOf("else ");
				pos=pos+4;
				while(temp1.charAt(pos)==' ')
					pos++;
				if(!(temp1.charAt(pos)=='i'&&temp1.charAt(pos+1)=='f'))
				{
					al.add(temp1.substring(temp1.indexOf("else "),temp1.indexOf("else ")+4));
					temp1=temp1.substring(temp1.indexOf("else ")+4);
				}
		
			}
			al.add(temp1);
		}	
		splitExtract7 = new String[al.size()];
		splitExtract7=al.toArray(splitExtract7);
		al.clear();
		forcombiner(splitExtract7);	
	}
	public void forcombiner(String[] str)
	{
		
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			String temp=str[i];
			while(temp.contains("for ")||temp.contains("for("))
			{
				String inc_state="("+str[i+2];
				int end_index=bracketfinder(inc_state,0)-1;
				String together=str[i]+str[i+1]+str[i+2].substring(0,end_index);
				temp=str[i+2].substring(end_index);
				al.add(together);
				i=i+2;
			}
			al.add(temp);
		}
		
		splitExtract8 = new String[al.size()];
		splitExtract8=al.toArray(splitExtract8);
		al.clear();
		blankspaceremove(splitExtract8);
		
	}
	public int bracketfinder(String str,int pos)
	{
		
		int count=0;
		
		while(str.charAt(pos)==' '&&pos<str.length())
			pos++;
		if(pos!=str.length())
		if(str.charAt(pos)=='(')
		{
			count++;
			pos++;
			while(count!=0&&pos<str.length())
			{
				if(str.charAt(pos)=='(')
					count++;
				else if(str.charAt(pos)==')')
					count--;
				pos++;
			
			}
			
		}
		if(pos==str.length())
			pos--;
		System.out.println(pos);
		return pos;
	}
	public void blankspaceremove(String[] str)
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			String temp=str[i];
			//System.out.print(temp);
			temp=temp.replaceAll("\\s"," ");
			//System.out.print(temp);
			int pos=0;
			while(pos<temp.length()&&temp.charAt(pos)==' ')
				pos++;
			if(pos!=temp.length()&&temp.charAt(pos)!='\n')
				al.add(temp);
		}
		codeInStatements = new String[al.size()];
		codeInStatements=al.toArray(codeInStatements);
		al.clear();
		
	}
	public String[] getcode()
	{
		split();
		comeon();
		return codeInStatements;
	}

}
