package Day9.String;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Notes
		
		/*String is immutable
		 * StringBuffer is mutable
		 * StringBuilder is mutable 
		 * Strings that are created by stringBuffer contents can be changed and edited 
		 * For StringBuffer we use append to concatenate
		 * we can use name.Append(), reverse(),replace(),delete(),substring() in order to do different tasks
		 */

		
		StringBuffer name = new StringBuffer("Hana");
		
		name.append(" Getachew"); // we use append as concat or + to concatenate strings
		
		System.out.println(name);


	
		
	}

}
