package buddhuram;

import java.util.ArrayList;

public class Operand implements OperandInterface{

	private int start,width;// stores the starting position of literal and also its width
	private int type;
	private Object value;
	private int boxno;
	private ArrayList<IndexQualifier> indexes=new ArrayList<IndexQualifier>();
	
	Operand(int type)
	{
		this.type=type;
		
	}
	
	Operand(int type,int boxno)
	{
		this.type=type;
		this.boxno=boxno;
		
	}
	Operand(int type,int boxno, ArrayList<IndexQualifier> indexes)
	{
		this.type=type;
		this.boxno=boxno;
		this.indexes= indexes;
	}
	Operand (int type,Object value,int start,int width )
	{
		this.type=type;
		this.value= value;
		this.start=start;
		this.width=width;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public int getBoxno() {
		return boxno;
	}
	public void setBoxno(int boxno) {
		this.boxno = boxno;
	}
	public ArrayList<IndexQualifier> getIndexes() {
		// TODO Auto-generated method stub
		return this.indexes;
	}	
}
