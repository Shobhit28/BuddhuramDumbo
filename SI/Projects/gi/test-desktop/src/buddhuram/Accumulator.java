package buddhuram;

public class Accumulator {
	
	static Object value;
	
	public static boolean getBoolean() {
		if((Boolean) value)
		return true;
		else return false;
	}

	
	public static Object getValue() {
		return value;
	}
}
