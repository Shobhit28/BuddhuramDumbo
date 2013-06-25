package buddhuram;

import java.io.IOException;

public interface DumboInterface {

	void graphicsLabel(String label,int boxno) throws IOException;
	void moveDumbo(int type1,int type2);
	void openBox(int boxno);
	void closeBox(int boxno);
	void pickValue(int type,double number);
	void pickValue(int type);
	void releaseValue(int type, int number);
	void lookToRegisterWall();
	void lookToMemoryWall(int boxno);
	void setCameraToDefaultLook();
	
	
}
