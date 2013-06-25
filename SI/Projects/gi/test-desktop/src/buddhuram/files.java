package buddhuram;
public enum files {

file1("1.Valid Declarations.txt",1),	
file2("3.Declaration with valid initialisations.txt",2),
file3("5.Initialisations with variables.txt",3),
file4("6.Basic Arithmetic Operations.txt",4),
file6("7.Basic Logical Operations.txt",5),
file7("8.Increment Operations.txt",8),
file8("9.Basic Assignment Operations.txt",9),
file9("10.Basic Conditional Operations.txt",10),;

private final String filename;
private final int value;

 files(String name,int map){
	
	filename=name;
	value=map;
	
}

public String getFile(){
	return filename;
}

public int getValue(){
	return value;
}

/*public static void main(String[] args) {
        System.out.println(file1.getFile() + file1.getValue());
        System.out.println(Status.getStatus(-1));
    }*/



}
