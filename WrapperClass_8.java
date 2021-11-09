package content;

public class WrapperClass_8 {

	public static void main(String[] args) {
		/*Function-1 valueof()
		 * static method 
		 * Return Object refrence  of relative wrapper class
		 */
	
	Integer i1 = 	Integer.valueOf("123");//calling the function of Integer class 
	System.out.println(i1);	
	
	/*
		 * i1 represent a refrnece of object 
		 * value of is static function in integer class
		 */
		Integer.valueOf("11011",2);
		//it store the value in decimal equivivalent
	
		Double d1 = Double.valueOf("3.14");
		
	/*
	 * Function -2 parseXxx()
	 	*static method 
		*xxx can be replaced by any primitive type
		*it return xxx type value
*/
			int a = Integer.parseInt("234");
			float b = Integer.parseInt("666");
			
			/*
			 * Function - xxxValue()
			 * instance method of wrapper class
			 * XXX can be replaced by any primitive type 
			 * return corresponding primitive type
			 */
			i1.intValue();
			

	}

}
