package buddhuram;


public interface GraphicalInterface {

	
	//DATA TYPES
	public static final int INTEGER =1;
	public static final int FLOAT =2;
	public static final int CHAR =3;
	public static final int STRING =4;
	public static final int BOOLEAN =5;
	public static final int DOUBLE =6;
	
	//operators
	public static final int ADD =1;
	public static final int SUBTRACT =2;
	public static final int MULTIPLICATION =3;
	public static final int DIVISION =4;
	public static final int MODULUS=5;
	public static final int LESSTHAN =6;
	public static final int GREATERTHAN =7;
	public static final int LESSTHANEQUALSTO =8;
	public static final int GREATERTHANEQUALSTO =9;
	public static final int EQUALSTO =10;
	public static final int NOTEQUALSTO =11;
	public static final int LEFTSHIFT =12;
	public static final int RIGHTSHIFT =13;
	public static final int LOGICALAND =14;
	public static final int LOGICALOR =15;
	public static final int LOGICALNOT =16;
	public static final int BITWISEOR =17;
	public static final int BITWISENOT =18;
	public static final int BITWISEAND =19;
	public static boolean flag = false;
	
	/*The label command is used for labelling purpose. The type parameter denotes the data type 
	  and the Qualifier tells what extra information is associated with the identifier*/ 
	 
	public Command createLabelCommand(String identifier, int type, Qualifier qualifier);
	
	//The store command is used to store values in types such as box, accumulators,cache etc
	public Command createStoreCommand(Operand lhs, Operand rhs);
	
	//used for creating operations
	public Command createOperationCommand(int operator, Operand operand1, Operand operand2);
	
	// used for display
	public Command createDisplayCommand(String codeLine,int lineno);
	
	
	
}
