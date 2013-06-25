package buddhuram;

import java.util.ArrayList;
import java.util.HashMap;

public class Memory {

	static int address_caret=0;
	//static ArrayList<>
	static ArrayList<Integer> types=new ArrayList<Integer>();
	static ArrayList<Box> boxes=new ArrayList<Box>();
	static ArrayList<Display> disp = new ArrayList<Display>();
	static ArrayList<Qualifier> qualifiers=new ArrayList<Qualifier>();
	static HashMap<String,Integer> id_map=new HashMap<String,Integer>();
	static HashMap<Integer,String> add_map=new HashMap<Integer,String>();
	public static Box getBoxInstance(int box_num)
	{
		return boxes.get(box_num);
	}
	public static int doRegisterBox(String identifier)
	{
		
		id_map.put(identifier,address_caret);
		System.out.println(id_map.get("ab"));
		add_map.put(address_caret,identifier);
		address_caret++;
		
		return address_caret-1;
	}
	public static int getBoxNumber(String identifier)
	{
		System.out.println("In get box");
		return id_map.get(identifier);
	}
	//search for label and return box number
	public static String getLabel(int boxno)
	{
		return add_map.get(boxno);
	}
	public static Qualifier getQualifier(String identifier)
	{
		return qualifiers.get(getBoxNumber(identifier));
	}
	public static int getType(String identifier)
	{
		return types.get(getBoxNumber(identifier));
	}
	public static Object getValue(String identifier)
	{
		return Memory.boxes.get(Memory.getBoxNumber(identifier)).getValue(0);
	}
	
}
