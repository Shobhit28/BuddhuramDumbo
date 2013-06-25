package buddhuram;

import java.util.ArrayList;

public class Box {
	private ArrayList<Integer> address;
	public ArrayList<Object> value;
	public int box_number;


	public Object getValue(int n)
	{
		return value.get(n);
	}
	public Box()
	{
		setAddress(new ArrayList<Integer>());
		value=new ArrayList<Object>();

	}
	public Object getValue(ArrayList<IndexQualifier> dim1)
	{
		ArrayList<Integer> dim=new ArrayList<Integer>();
		
		//process object and get values
		for(int i=0;i<dim1.size();i++)
		{
			switch(dim1.get(i).type)
			{
			case IndexQualifierInterface.ACCUMULATOR:
				dim.add((Integer)Accumulator.getValue());
				break;
			case IndexQualifierInterface.BOXNUMBER:
				dim.add((Integer)Memory.boxes.get((Integer)dim1.get(i).value).getValue(0));
				break;
			case IndexQualifierInterface.CACHE:
				dim.add((Integer)Cache.stack.pop());
				break;
			case IndexQualifierInterface.CHAR:
				dim.add((Integer)dim1.get(i).value);
				break;
			case IndexQualifierInterface.INTEGER:
				dim.add((Integer)dim1.get(i).value);
				break;
			}
		}
		
		
		return value.get(get1D(dim));
	}
	public int get1DCorrect(ArrayList<IndexQualifier> dim1)
	{
		ArrayList<Integer> dim=new ArrayList<Integer>();
		
		//process object and get values
		for(int i=0;i<dim1.size();i++)
		{
			switch(dim1.get(i).type)
			{
			case IndexQualifierInterface.ACCUMULATOR:
				dim.add((Integer)Accumulator.getValue());
				break;
			case IndexQualifierInterface.BOXNUMBER:
				dim.add((Integer)Memory.boxes.get((Integer)dim1.get(i).value).getValue(0));
				break;
			case IndexQualifierInterface.CACHE:
				dim.add((Integer)Cache.stack.pop());
				break;
			case IndexQualifierInterface.CHAR:
				dim.add((Integer)dim1.get(i).value);
				break;
			case IndexQualifierInterface.INTEGER:
				dim.add((Integer)dim1.get(i).value);
				break;
			}
		}
		return get1D(dim);
	}
	private int get1D(ArrayList<Integer> dim)
	{
		int n=0;
		for(int i=dim.size();i>0;i--)
		{
			int m=1;
			for(int j=(i-1);j>0;j--)
			{
				m*=Memory.qualifiers.get(this.box_number).getDimensions().get(j-1);
			}
			n+=(m*dim.get(dim.size()-i));
		}
		return n;
	}



	public void createBox(Command comm)
	{
		box_number=Memory.doRegisterBox(comm.getIdentifier());
		Memory.qualifiers.add(comm.getQualifier());
		Memory.types.add(comm.getType());
	}
	public void typeCastRhs()
	{
		
	}
	public  static void storeOperation(Operand op1,Operand op2)
	{
		switch(op1.getType())
		{
		case Operand.BOXNO:
			System.out.println("Operand 1 is box number");
			switch(op2.getType())
			{
			case Operand.BOXNO:
				switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
				{
				case Qualifier.OTHERS:
					switch(Memory.qualifiers.get(op2.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op2.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes()));
						break;

					}
					break;	
				case Qualifier.ARRAY:
					switch(Memory.qualifiers.get(op2.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()), Memory.boxes.get(op2.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()),Memory.boxes.get(op2.getBoxno()).getValue(op1.getIndexes()));    
						break;

					}
					break;	
				}
				break;
			case Operand.ACCUMULATOR:
				switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
				{
				case Qualifier.OTHERS:
					Memory.boxes.get(op1.getBoxno()).value.add(Accumulator.value);
					break;
				case Qualifier.ARRAY:
					Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()),Accumulator.value);
					break;

				}
				break;
			case Operand.CHAR:
				switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
				{
				case Qualifier.OTHERS:
					Memory.boxes.get(op1.getBoxno()).value.add(Display.codeline.charAt(op2.getStart()+op2.getWidth()-1));

					break;
				case Qualifier.ARRAY:
					Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()),(Object)Display.codeline.charAt(op2.getStart()+op2.getWidth()-1));
					break;

				}
				break;
			case Operand.INTEGER:
				switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
				{
				case Qualifier.OTHERS:
					System.out.println("others and literal case executed");
					System.out.println(Integer.parseInt(Display.codeline.substring(7,8)));
					Memory.boxes.get(op1.getBoxno()).value.add((Object)(Integer.parseInt(Display.codeline.substring(op2.getStart(),op2.getStart()+op2.getWidth()))));
					break;
				case Qualifier.ARRAY:
					Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()),(Object)(Integer.parseInt(Display.codeline.substring(op2.getStart(),op2.getStart()+op2.getWidth()))));
					break;
				}
				break;
			case Operand.FLOAT:
				switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
				{
				case Qualifier.OTHERS:
					Memory.boxes.get(op1.getBoxno()).value.add((Object)(Float.parseFloat(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString())));
					break;
				case Qualifier.ARRAY:
					Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()),(Object)(Float.parseFloat(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString())));					
					break;

				}
				break;
			case Operand.DOUBLE:
				switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
				{
				case Qualifier.OTHERS:
					Memory.boxes.get(op1.getBoxno()).value.add((Object)(Double.parseDouble(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString())));
					break;
				case Qualifier.ARRAY:
					Memory.boxes.get(op1.getBoxno()).value.add(Memory.boxes.get(op1.getBoxno()).get1DCorrect(op1.getIndexes()),(Object)(Double.parseDouble(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString())));					
					break;
				}
				break;
			}
			System.out.println("Entering other switch"+op1.getType());
			switch(op2.getType())
			{
				case GraphicalInterface.INTEGER:
					switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Integer)Memory.boxes.get(op1.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Integer)Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes()));
						break;
					}
					break;
				case GraphicalInterface.CHAR:
					switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Character)Memory.boxes.get(op1.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Character)Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes()));
						break;
					}
					break;
				case GraphicalInterface.FLOAT:
					switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Float)Memory.boxes.get(op1.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Float)Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes()));
						break;
					}
					break;
				case GraphicalInterface.DOUBLE:
					switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Double)Memory.boxes.get(op1.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Double)Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes()));
						break;
					}
					break;
				case GraphicalInterface.BOOLEAN:
					switch(Memory.qualifiers.get(op1.getBoxno()).getQualifier_type())
					{
					case Qualifier.OTHERS:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Boolean)Memory.boxes.get(op1.getBoxno()).value.get(0));
						break;
					case Qualifier.ARRAY:
						Memory.boxes.get(op1.getBoxno()).value.add(0,(Boolean)Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes()));
						break;
					}
					break;
			}
			break;
		case Operand.CACHE:
			//get value from accumulator
			//put it into cache
			Cache.stack.push(Accumulator.getValue());
			
			break;
		case Operand.REGISTER:
			switch(op2.getType())
			{
			case Operand.BOXNO:
				switch(Memory.qualifiers.get(op2.getBoxno()).getQualifier_type())
				{
				case Qualifier.ARRAY:
					if(!Register.getIs_filled())
						{Register.r1.value=Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes());
						Register.setIs_filled(true);}
					else
						Register.r2.value=Memory.boxes.get(op2.getBoxno()).getValue(op2.getIndexes());
					break;
				case Qualifier.OTHERS:
					if(!Register.getIs_filled())
					{
						System.out.println("Register and others case executed");
						Register.r1.value=Memory.boxes.get(op2.getBoxno()).value.get(0);
						Register.setIs_filled(true);}
					else
						Register.r2.value=Memory.boxes.get(op2.getBoxno()).value.get(0);
					
					break;
					
				}
				break;
			case Operand.ACCUMULATOR:
				if(!Register.getIs_filled())
				{
					Register.r1.value=Accumulator.value;
					Register.setIs_filled(true);}
				else
					Register.r2.value=Accumulator.value;


				break;
			case Operand.CACHE:
				if(!Register.getIs_filled())
					Register.r1.value=Cache.stack.pop();
				else
					Register.r2.value=Accumulator.value;
				break;
			case Operand.CHAR:
				if(!Register.getIs_filled())
					{
					Register.r1.value=Display.codeline.charAt(op2.getStart()+op2.getWidth()-1);
					Register.setIs_filled(true);}
					
				else
					Register.r2.value=Display.codeline.charAt(op2.getStart()+op2.getWidth()-1);
			
				break;
			case Operand.INTEGER:
				if(!Register.getIs_filled())
					{Register.r1.value=(Object)(Integer.parseInt(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString()));
					Register.setIs_filled(true);}
					
				else
					Register.r2.value=(Object)(Integer.parseInt(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString()));
			
				break;
			case Operand.FLOAT:
				if(!Register.getIs_filled())
					{Register.r1.value=(Object)(Float.parseFloat(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString()));
					Register.setIs_filled(true);}
					
				else
					Register.r2.value=(Object)(Float.parseFloat(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString()));
			
				break;
			case Operand.DOUBLE:
				if(!Register.getIs_filled())
					{
					Register.r1.value=(Object)(Double.parseDouble(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString()));
					Register.setIs_filled(true);
					}
				else
					Register.r2.value=(Object)(Double.parseDouble(Display.codeline.subSequence(op2.getStart(),op2.getStart()+op2.getWidth()).toString()));
			
				break;
			}
			break;
		}
	}
	public ArrayList<Integer> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<Integer> address) {
		this.address = address;
	}


}
