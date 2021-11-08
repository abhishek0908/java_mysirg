package content;

public class typeCasting {

	public static void main(String[] args) {
		//Widening Convension
				int y=3;
				float x=y;//Widening convension No Error
				//Narrowing Conversion
				float p  = 3.4f;
				// int q=p;
				/*This line Give an error because its going to data loss for preventing
				 * error we using typecasting concept
		 		
				*/
				float q = (int)p; //forcefully conversion but in this also we loss data


	}

}
