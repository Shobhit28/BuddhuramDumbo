package buddhuram;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.io.*;
import java.util.*;
public class Buddhuram {

	private int lineno;
	private String filename ;   
	private String instruction;
	static LinkedList<Command> list;
	InterfaceClass objInterface  = new InterfaceClass();
	public Buddhuram(String name,LinkedList<Command> lis)
	{
		this.filename = name;
		list=lis;
	}
	public void setParameters(int numb, String inst)
	{

		lineno =  numb;
		instruction = inst;
	}

	public void parseTest()
	{
		System.out.println(this.lineno+" "+this.instruction);
	}

	public void parse() 
	{

		int fileno=0;	
		System.out.println("PARSE CALLED");



		 list.add(objInterface.createDisplayCommand(instruction,lineno));
		for(files file: files.values())
		{
			if((file.getFile()).equals(filename))
			{
				System.out.println(file.getFile() + file.getValue() + "\n");    		  
				fileno=file.getValue();

			}
		}  

		System.out.println("FILE NUMBER "+ fileno);
		switch(fileno)
		{
		case 1:
			switch(lineno)  
			{
			case 1: list.add(objInterface.createLabelCommand("abc", 1, new Qualifier(0)));
			//System.out.println(this.list.poll().getIdentifier());
			break;
			case 2: list.add(objInterface.createLabelCommand(new String("_triyogfv"), 2, new Qualifier(0)));
			break;
			case 3:list.add(objInterface.createLabelCommand(new String("youu123hut"), 3, new Qualifier(0)));
			break;
			default:
				System.out.println("no case in budduram");

			}
			break;
		case 2:
			switch(lineno)
			{
			case 1: list.add(objInterface.createLabelCommand(new String("ab"), 1, new Qualifier(0)));
			System.out.println("2nd com to be exec");
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("ab")),new Operand (1,5,8,1))); 
			break;
			case 2: list.add(objInterface.createLabelCommand(new String("c"), 1, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")),new Operand (1,.101,7,4)));
			list.add(objInterface.createLabelCommand(new String("d"), 1, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("d")),new Operand (1,7.5,14,3)));    
			break;
			case 3:  list.add(objInterface.createLabelCommand(new String("fi"), 2, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("fi")),new Operand (3,90,10,2)));
			list.add(objInterface.createLabelCommand(new String("gi"), 2, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("gi")),new Operand (3,8.8,16,3))); 
			break;
			case 4:  list.add(objInterface.createLabelCommand(new String("sd"), 3, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("sd")),new Operand (2,'h',9,3)));
			break;
			case 5:  list.add(objInterface.createLabelCommand(new String("h"), 3, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("h")),new Operand (2,45,8,2)));
			break;  
			case 6:  list.add(objInterface.createLabelCommand(new String("y"), 2, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("y")),new Operand (3,5.890,9,5))); 
			break;
			case 7:  list.add(objInterface.createLabelCommand(new String("f"), 1, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("f")),new Operand (1,43546,7,4)));
			break;
			case 8:  list.add(objInterface.createLabelCommand(new String("ghi"), 3, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("ghi")),new Operand (2,'i',10,5)));
			break;          
			}
			break;
		case 3:
			switch(lineno)
			{
			case 1: list.add(objInterface.createLabelCommand(new String("g"), 1, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("g")))); 
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,1,11,1)));
			list.add(objInterface.createOperationCommand(1, new Operand(6), new Operand(6))); 
			list.add(objInterface.createLabelCommand(new String("h"), 1, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("h")), new Operand(7)));
			break;
			case 2:  list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("h"))));
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand (3,0.3,11,3)));
			list.add(objInterface.createOperationCommand(3, new Operand(6), new Operand(6))); 
			list.add(objInterface.createLabelCommand(new String("f"), 2, new Qualifier(0)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("f")), new Operand(7)));
			break;

			}
			break;
		case 4:
			switch(lineno)
			{
			case 1:
				list.add(objInterface.createLabelCommand(new String("a"),1,new Qualifier(0)));
				list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("a")),new Operand(1,2,7,1)));
				break;
			case 2:
				list.add(objInterface.createLabelCommand(new String("b"),1,new Qualifier(0)));
				list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("b")),new Operand(1,3,7,1)));
				break;
			case 3:
				list.add(objInterface.createLabelCommand(new String("c"),1,new Qualifier(0)));
				break;
			case 4:
				list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));
				list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b"))));
				list.add(objInterface.createOperationCommand(1,new Operand(5,Memory.getBoxNumber("a")),new Operand(5,Memory.getBoxNumber("b"))));
				list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")),new Operand(7))); 

			}
			break; 
		case 5:
			switch(lineno)

			{
			case 1:    list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(15, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break; 
			case 2:    list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(14, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 3:    list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,5,6,1)));
			list.add(objInterface.createOperationCommand(15, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 4:   list.add(objInterface.createStoreCommand(new Operand(6),new Operand(1,5,3,1)));
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,3,6,1)));
			list.add(objInterface.createOperationCommand(14, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 5:   list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(17, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break; 
			case 6:  list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(19, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break; 

			case 7:  list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(20, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break; 

			case 8:   list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,5,3,1)));
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a")))); 
			list.add(objInterface.createOperationCommand(20, new Operand(6), new Operand(6))); 
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 9:  list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(12, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break; 

			case 10: list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("b")))); 
			list.add(objInterface.createOperationCommand(13, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break; 

			case 11:  list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a"))));  
			list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,3,6,1)));
			list.add(objInterface.createOperationCommand(13, new Operand(6), new Operand(6)));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 12:    list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a")))); 
			list.add(objInterface.createOperationCommand(16, new Operand(6), null));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 13:   list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,2,4,1)));
			list.add(objInterface.createOperationCommand(16, new Operand(6), null));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 14:   list.add(objInterface.createStoreCommand(new Operand(6),new Operand(5,Memory.getBoxNumber("a")))); 
			list.add(objInterface.createOperationCommand(18, new Operand(6), null));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;

			case 15:  list.add(objInterface.createStoreCommand(new Operand(6),new Operand (1,2,4,1)));
			list.add(objInterface.createOperationCommand(18, new Operand(6), null));
			list.add(objInterface.createStoreCommand(new Operand(5,Memory.getBoxNumber("c")), new Operand(7)));
			break;  
			}
		case 6:
			switch(lineno){}
		case 7:
			switch(lineno){}
		case 8:
			switch(lineno){}
		case 9:
			switch(lineno){}
		case 10:
			switch(lineno){}
		}

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getIdentifier());
		}

		//return(list);


	}
	/* public static void  main(String[] args)
      {
    	Buddhuram obj = new Buddhuram();
    	obj.setParameters("1.Valid Declarations.txt", 1, "int abc;");
    	obj.parse();

         Command com=list.poll();

         if(com.getCommandtype()==4)
         {
        	 System.out.println(com.getCodeline());
        	 System.out.println(com.getLineno());
         }



}*/
}
