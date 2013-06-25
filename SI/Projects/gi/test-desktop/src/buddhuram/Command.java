package buddhuram;

import java.io.IOException;

import com.me.test.DesktopGraphics;
import com.me.test.image;

public class Command implements CommandInterface{


	private int commandtype=0;
	private Operand op1,op2;
	private int operator;
	private int type;
	private String identifier;
	private Qualifier qualifier;
	private String codeline;
	private int lineno;
	private static final int showtime = 1500;
	Box box;
	Dumbo dumbo = new Dumbo();
	public int getCommandtype() {
		return commandtype;
	}




	public void setCommandtype(int commandtype) {
		this.commandtype = commandtype;
	}




	public Operand getOp1() {
		return op1;
	}




	public void setOp1(Operand op1) {
		this.op1 = op1;
	}




	public Operand getOp2() {
		return op2;
	}




	public void setOp2(Operand op2) {
		this.op2 = op2;
	}




	public int getOperator() {
		return operator;
	}




	public void setOperator(int operator) {
		this.operator = operator;
	}




	public int getType() {
		return type;
	}




	public void setType(int type) {
		this.type = type;
	}




	public String getIdentifier() {
		return identifier;
	}




	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}




	public Qualifier getQualifier() {
		return qualifier;
	}




	public void setQualifier(Qualifier qualifier) {
		this.qualifier = qualifier;
	}




	public String getCodeline() {
		return codeline;
	}




	public void setCodeline(String codeline) {
		this.codeline = codeline;
	}




	public int getLineno() {
		return lineno;
	}




	public void setLineno(int lineno) {
		this.lineno = lineno;
	}


	@Override
	public void executecommand() throws IOException {


		try {
			switch(this.commandtype)
			{
			case 1:
				SharedObject.dummy_obj.look_to_memory_wall(Memory.getBoxNumber(this.identifier));
				dumbo.graphicsLabel(this.identifier,Memory.boxes.get(Memory.getBoxNumber(this.identifier)).box_number);
				Thread.sleep(showtime);
				SharedObject.dummy_obj.look_to_default();
				break;
			case 2:
				Box.storeOperation(this.op1,this.op2);
				switch(this.op2.getType())
				{
				case Operand.BOXNO:
					SharedObject.dummy_obj.look_to_memory_wall(this.op2.getBoxno());
					SharedObject.dummy_obj.box_open(this.op2.getBoxno());
					SharedObject.dummy_obj.show_text(0, this.op2.getBoxno(),  ""+(Memory.boxes.get(this.op2.getBoxno()).getValue(0)));
					Thread.sleep(showtime);
					SharedObject.dummy_obj.box_close(this.op2.getBoxno());
					SharedObject.dummy_obj.look_to_register_wall();
					SharedObject.dummy_obj.show_text(1, DesktopGraphics.a++,  ""+(Memory.boxes.get(this.op2.getBoxno()).getValue(0)));
					Thread.sleep(showtime);
					SharedObject.dummy_obj.look_to_default();
					if(DesktopGraphics.a >2)
						DesktopGraphics.a=1;
					break;
				case Operand.ACCUMULATOR:
					SharedObject.dummy_obj.look_to_register_wall();
					Thread.sleep(showtime);
					SharedObject.dummy_obj.look_to_memory_wall(this.op1.getBoxno());
					SharedObject.dummy_obj.box_open(this.op1.getBoxno());
					SharedObject.dummy_obj.show_text(0, this.op1.getBoxno(),""+Memory.boxes.get(this.op1.getBoxno()).getValue(0));
					Thread.sleep(showtime);
					SharedObject.dummy_obj.box_close(this.op1.getBoxno());
					SharedObject.dummy_obj.look_to_default();
					break;
				case Operand.REGISTER:
					SharedObject.dummy_obj.look_to_register_wall();
					Thread.sleep(showtime);
					SharedObject.dummy_obj.look_to_memory_wall(this.op1.getBoxno());
					SharedObject.dummy_obj.box_open(this.op1.getBoxno());
					SharedObject.dummy_obj.show_text(0, this.op1.getBoxno(), ""+Memory.boxes.get(this.op1.getBoxno()).getValue(0));
					SharedObject.dummy_obj.box_close(this.op1.getBoxno());
					SharedObject.dummy_obj.look_to_default();
					break;
				case Operand.CHAR:
					switch (this.op1.getType())
					{
					case Operand.BOXNO:
						SharedObject.dummy_obj.look_to_memory_wall(this.op1.getBoxno());
						SharedObject.dummy_obj.box_open(this.op1.getBoxno());
						SharedObject.dummy_obj.show_text(0, this.op1.getBoxno(), ""+(Memory.boxes.get(this.op1.getBoxno()).getValue(0)));
						Thread.sleep(showtime);
						SharedObject.dummy_obj.box_close(this.op1.getBoxno());
						SharedObject.dummy_obj.look_to_default();
						break;
					case Operand.REGISTER:
						SharedObject.dummy_obj.look_to_register_wall();
						if (DesktopGraphics.a == 1)
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r1.value);
						else
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r2.value);
						if (DesktopGraphics.a > 2)
							DesktopGraphics.a =1;
						Thread.sleep(showtime);
						SharedObject.dummy_obj.look_to_default();
					}
					break;
				case Operand.INTEGER:
					switch (this.op1.getType())
					{
					case Operand.BOXNO:
						SharedObject.dummy_obj.look_to_memory_wall(this.op1.getBoxno());
						SharedObject.dummy_obj.box_open(this.op1.getBoxno());
						SharedObject.dummy_obj.show_text(0, this.op1.getBoxno(), ""+(Memory.boxes.get(this.op1.getBoxno()).getValue(0)));
						Thread.sleep(showtime);
						SharedObject.dummy_obj.box_close(this.op1.getBoxno());
						SharedObject.dummy_obj.look_to_default();
						break;
					case Operand.REGISTER:
						SharedObject.dummy_obj.look_to_register_wall();
						if (DesktopGraphics.a == 1)
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r1.value);
						else
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r2.value);
						if (DesktopGraphics.a > 2)
							DesktopGraphics.a =1;
						Thread.sleep(showtime);
						SharedObject.dummy_obj.look_to_default();
					}
					break;
				case Operand.FLOAT:
					switch (this.op1.getType())
					{
					case Operand.BOXNO:
						SharedObject.dummy_obj.look_to_memory_wall(this.op1.getBoxno());
						SharedObject.dummy_obj.box_open(this.op1.getBoxno());
						SharedObject.dummy_obj.show_text(0, this.op1.getBoxno(), ""+(Memory.boxes.get(this.op1.getBoxno()).getValue(0)));
						Thread.sleep(showtime);
						SharedObject.dummy_obj.box_close(this.op1.getBoxno());
						SharedObject.dummy_obj.look_to_default();
						break;
					case Operand.REGISTER:
						SharedObject.dummy_obj.look_to_register_wall();
						if (DesktopGraphics.a == 1)
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r1.value);
						else
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r2.value);
						if (DesktopGraphics.a > 2)
							DesktopGraphics.a =1;
						Thread.sleep(showtime);
						SharedObject.dummy_obj.look_to_default();
					}
					break;
				case Operand.DOUBLE:
					switch (this.op1.getType())
					{
					case Operand.BOXNO:
						SharedObject.dummy_obj.look_to_memory_wall(this.op1.getBoxno());
						SharedObject.dummy_obj.box_open(this.op1.getBoxno());
						SharedObject.dummy_obj.show_text(0, this.op1.getBoxno(), ""+(Memory.boxes.get(this.op1.getBoxno()).getValue(0)));
						Thread.sleep(showtime);
						SharedObject.dummy_obj.box_close(this.op1.getBoxno());
						SharedObject.dummy_obj.look_to_default();
						break;
					case Operand.REGISTER:
						SharedObject.dummy_obj.look_to_register_wall();
						if (DesktopGraphics.a == 1)
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r1.value);
						else
							SharedObject.dummy_obj.show_text(1	,DesktopGraphics.a++ ,""+ Register.r2.value);
						if (DesktopGraphics.a > 2)
							DesktopGraphics.a =1;
						Thread.sleep(showtime);
						SharedObject.dummy_obj.look_to_default();
					}
					break;
				}
				break;
			case 3:
				SharedObject.dummy_obj.look_to_register_wall();
				Register.performOperation(this.operator,this.op1,this.op2);
				Thread.sleep(100);
				SharedObject.dummy_obj.show_text(3, 0, "+");
				Thread.sleep(1000);
				SharedObject.dummy_obj.show_text(2, 0, ""+Accumulator.getValue());
				break;
			case 4:
				Display.codeline=this.getCodeline();
				Display.lineno=this.lineno;
				image img = new image(Integer.toString(Display.lineno) +"."+ Display.codeline);
				img.createImage();
				Thread.sleep(100);
				SharedObject.dummy_obj.displaycmd(Integer.toString(Display.lineno) +". "+ Display.codeline);
				break;
			}
		}
		catch (Exception e) {

			e.printStackTrace();
		}

	}




	@Override
	public void printcommand() {
		

	}

}
