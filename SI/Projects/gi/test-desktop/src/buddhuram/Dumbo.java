package buddhuram;

import java.io.IOException;



public class Dumbo implements DumboInterface
{

	@Override
	public void graphicsLabel(String label, int boxno) throws IOException {
		SharedObject.dummy_obj.labelBox(label, boxno);
}

	@Override
	public void moveDumbo(int type1,int type2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openBox(int boxno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBox(int boxno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickValue(int type,double number) {
		// TODO Auto-generated method stub
		
	}
	public void pickValue(int type) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void releaseValue(int type,int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookToRegisterWall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookToMemoryWall(int boxno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCameraToDefaultLook() {
		// TODO Auto-generated method stub
		
	}

}
