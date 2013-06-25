package buddhuram;

import java.io.IOException;

public interface CommandInterface {
	public static final int LABEL =1;
	public static final int STORE =2;
	public static final int OPERATION =3;
	public static final int DISPLAY =4;
	public void executecommand() throws IOException;
	public void printcommand();
}
