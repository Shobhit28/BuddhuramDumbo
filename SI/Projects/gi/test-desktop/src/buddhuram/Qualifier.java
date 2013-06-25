package buddhuram;

import java.util.ArrayList;

public class Qualifier implements QualifierInterface {
	private ArrayList<Integer> dimensions;
	private int qualifier_type;
	public Qualifier(int type)
	{
		if(type == ARRAY)
			System.out.println("Dimensions not given");
		this.qualifier_type=type;	
	}
	public Qualifier(int type, ArrayList<Integer> dimensions)
	{
		if(type == ARRAY || type == ARRAYOFPOINTERS)
	       this.dimensions=dimensions;
		this.qualifier_type=type;
	}
	public ArrayList<Integer> getDimensions() {
		return dimensions;
	}
	
	public int getQualifier_type() {
		return qualifier_type;
	}
	
	
}
