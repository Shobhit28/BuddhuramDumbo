package buddhuram;

public class InterfaceClass implements GraphicalInterface{

	
	
	@Override
	public Command createLabelCommand(String identifier, int type,Qualifier qualifier) {
		 Command command = new Command();
		command.setCommandtype(1);
		
		command.setIdentifier(identifier);
		command.setType(type);
		command.setQualifier(qualifier);
		Box box=new Box();
		box.createBox(command);
		Memory.boxes.add(box);
		System.out.println(identifier+": in label  :"+type);
		return command;
	}

	@Override
	public Command createStoreCommand(Operand lhs, Operand rhs) {
		Command command = new Command();
		command.setCommandtype(2);
		command.setOp1(lhs);
		command.setOp2(rhs);
		
		return command;
	}

	@Override
	public Command createOperationCommand(int operator, Operand operand1,Operand operand2) {
		Command command = new Command();
		command.setCommandtype(3);
		command.setOperator(operator);
		command.setOp1(operand1);
		command.setOp2(operand2);
		
		return command;
	}

	@Override
	public Command createDisplayCommand(String codeLine,int lineno) {
		Command command = new Command();
		command.setCommandtype(4);
		command.setCodeline(codeLine);
		command.setLineno(lineno);
		return command;
	}
	

}
