package buddhuram;

public class Register {
	
	
	int reg_id;
	static boolean is_filled;
	Object value;
	static Register r1 = new Register();
	static Register r2 = new Register();

	public static void performOperation(int operator,Operand op1,Operand op2)
	{
		switch(operator)
		{
			case GraphicalInterface.ADD:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value + (Float)Register.r2.value;
				}
				
				break;
			case GraphicalInterface.BITWISEAND:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value & (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value & (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator & is undefined for integer and double operands");
					//Accumulator.value= (Integer)Register.r1.value & (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator & is undefined for integer and float operands");
					//Accumulator.value= (Integer)Register.r1.value & (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value & (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value & (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator & is undefined for character and double operands");
					//Accumulator.value= (Character)Register.r1.value & (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator & is undefined for character and float operands");
					//Accumulator.value= (Character)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator & is undefined for integer and double operands");
					//Accumulator.value= (Double)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator & is undefined for character and double operands");
					//Accumulator.value= (Double)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator & is undefined for double and double operands");
					//Accumulator.value= (Double)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator & is undefined for float and double operands");
					//Accumulator.value= (Double)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator & is undefined for float and integer operands");
					//Accumulator.value= (Float)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator & is undefined for float and character operands");
					//Accumulator.value= (Float)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator & is undefined for float and double operands");
					Accumulator.value= (Float)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator & is undefined for float and float operands");
					//Accumulator.value= (Float)Register.r1.value + (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.BITWISENOT:
				if(((Integer) Register.r1.value) > 0)
				{
					Accumulator.value=0;
					
				}
				else
					Accumulator.value=1;
				
				break;
			case GraphicalInterface.BITWISEOR:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value | (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value | (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Integer)Register.r1.value | (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Integer)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value | (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value | (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Character)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Character)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value + (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.EQUALSTO:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value == (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value == (int)((Character)Register.r2.value);
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value == ((Double)Register.r2.value);
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value == (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value == (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value == (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value == (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value == (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value == (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value == (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value == (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value == (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value == (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value == (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value == (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.DIVISION:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value / (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value / (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value / (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value / (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value / (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value / (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value / (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value / (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value / (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value / (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value / (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value / (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value / (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value / (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value / (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value / (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.GREATERTHAN:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value > (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value > (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value > (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value > (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value > (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value > (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value > (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value > (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value > (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value > (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value > (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value > (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value > (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value > (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value > (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value > (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.GREATERTHANEQUALSTO:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value >= (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value >= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value >= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value >= (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value >= (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value >= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value >= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value >= (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value >= (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value >= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value >= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value >= (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value >= (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value >= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value >= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value >= (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.LEFTSHIFT:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value << (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value << (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value << (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Integer)Register.r1.value << (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value << (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value << (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Character)Register.r1.value << (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Character)Register.r1.value << (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value << (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value << (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value << (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value << (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value << (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value << (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value << (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value << (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.LESSTHAN:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value < (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value < (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value < (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value < (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value < (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value < (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value < (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value < (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value < (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value < (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value < (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value < (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value < (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value < (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value < (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value < (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.LESSTHANEQUALSTO:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value <= (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value <= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value <= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value <= (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value <= (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value <= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value <= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value <= (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value <= (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value <= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value <= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value <= (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value <= (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value <= (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value <= (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value <= (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.LOGICALAND:
				if((Boolean)Register.r1.value == true && (Boolean)Register.r2.value==true )
					Accumulator.value=1;
					
				else
					Accumulator.value=0;
				break;
			case GraphicalInterface.LOGICALNOT:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value + (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value + (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value + (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value + (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.LOGICALOR:
				if((Boolean)Register.r1.value == true || (Boolean)Register.r2.value==true )
					Accumulator.value=1;
					
				else
					Accumulator.value=0;

				
				break;
			case GraphicalInterface.MODULUS:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value % (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value % (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value % (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value % (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value % (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value % (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value % (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value % (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value % (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value % (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value % (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value % (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value % (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value % (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value % (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value % (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.MULTIPLICATION:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value * (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value * (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value * (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value * (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value * (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value * (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value * (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value * (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value * (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value * (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value * (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value * (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value * (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value * (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value * (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value * (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.NOTEQUALSTO:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value != (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value != (int)((Character)Register.r2.value);
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value != ((Double)Register.r2.value);
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value != (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value != (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value != (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value != (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value + (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value != (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value != (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value != (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value != (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value != (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value != (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value != (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value != (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.RIGHTSHIFT:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value >> (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value >> (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value >> (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Integer)Register.r1.value >> (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value >> (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value >> (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Character)Register.r1.value >> (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Character)Register.r1.value >> (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value >> (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value >> (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value >> (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Double)Register.r1.value >> (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value >> (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value >> (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value >> (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					System.out.println("The operator is undefined for this operation");
					//Accumulator.value= (Float)Register.r1.value >> (Float)Register.r2.value;
				}
				break;
			case GraphicalInterface.SUBTRACT:
				if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Integer)Register.r1.value - (Integer)Register.r2.value;  
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Integer)Register.r1.value - (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Integer)Register.r1.value - (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Integer")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Integer)Register.r1.value - (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Character)Register.r1.value - (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Character)Register.r1.value - (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Character)Register.r1.value - (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Character")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Character)Register.r1.value - (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Double)Register.r1.value - (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Double)Register.r1.value - (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Double)Register.r1.value - (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Double")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Double)Register.r1.value - (Float)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Integer"))
				{
					Accumulator.value= (Float)Register.r1.value - (Integer)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Character"))
				{
					Accumulator.value= (Float)Register.r1.value - (Character)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Double"))
				{
					Accumulator.value= (Float)Register.r1.value - (Double)Register.r2.value;
				}
				else if(Register.r1.value.getClass().getName().equals("java.lang.Float")&&Register.r2.value.getClass().getName().equals("java.lang.Float"))
				{
					Accumulator.value= (Float)Register.r1.value - (Float)Register.r2.value;
				}
				break;
			 default:
				System.out.println("Invalid operaton");
		}
		Register.is_filled=false;
	}

	public static  boolean getIs_filled() {
		return is_filled;
	}

	public static  void setIs_filled(boolean value) {
		is_filled = value;
	}
	
}
