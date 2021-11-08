package content;
class Example{
	int x; //Instance variable- means it is in  object of Example class
	/* if we write private static int y; 
	 * then we cannot access that outside the class in this case 
	 * we use function to access the private variable
	 */
	static int y;
	/* static variable member - are not in the object of example class , 
	 * this is class specific variable not object specifier
	*/
	public void fun1()// this is called instance function member
	{	
		//static int a;- this is not possible because "no static variable in methods
		
	}
	public static void fun2()// this is called instance function member
	{	
		
	}
	static class Test{// Static inner class or nested class
		public static String country = "india";
	}
}
public class staticLec_7 {

	public static void main(String[] args) {
		Example ex1 = new Example();
		Example ex2 = new Example();
		
		Example.y=5;
		Example.fun2();
		//Access Static class written below
		System.out.println(Example.Test.country);
		
		/*
		 * uses
		 * if we make any bank management system then rate is same of all account
		 * so we make rate a static variable
		 */
		

	}

}
