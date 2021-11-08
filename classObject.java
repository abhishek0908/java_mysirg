package content;

class Box{
	private int length,height,breath;
	public void setDimentions(int l, int b, int h)
	{
		length =l;
		breath = b;
		height =h;
	}
	public void showDimentions()
	{
		System.out.println("Length "+length);
		System.out.println("breath "+breath);
		System.out.println("height "+height);
	}
	
}

public class classObject {

	public static void main(String[] args) {
		
		//Box b;//we can't not create object like that c++
				Box smallBox = new Box();
				/*
				 * This is the process of creating java object but remember smallBox is 
				 * not the name of object it is the name of variable who is pointing box class
				 * 
				 */
				smallBox.setDimentions(4, 6, 7);
				smallBox.showDimentions();
				smallBox = new Box();
				//Important line if we create same obj again that that it is refence new memory block and pastone is destroy
				
				smallBox.showDimentions();
	}

}
