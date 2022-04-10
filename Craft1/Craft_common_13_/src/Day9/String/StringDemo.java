package Day9.String;

public class StringDemo {
	//NOTE
	/*String is non-primitive data type or reference data type or object data type.
	 * any thing under double quote even a space in the double quote is called String
	 * we categorize string because of String name = new String("James")
	 * String content is immutable because once we create a content of a string it is unchangeable. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = new String (" James");   // we can't change the content of the original value on our print statement
		
		System.out.println(name.concat("joy")); // this is one way of concatenating James with joy 
	
		System.out.println(name);
		
		// The other way to concatenate String is by using the + sign
	
		String stnew = "I " + "Love " + "Dimonds";
		System.out.println(stnew);
		
		int len = stnew.length(); // Here we assign stnew value to len. so that it will print how many characters it has in "I love Dimonds"
		
		System.out.println("length of String: " + len);
		
		// String with charAt:- this will give us the index(0- of the string
		
		String str1 = "This is Hana";
		System.out.println(str1.charAt(3)); // this prints s
		System.out.println(str1.charAt(str1.length()-1)); // this prints the last a
		
		// String comparison -- equal method
		
		String str2 = "Ismael";
		String str3 = "ismael"; // If there is a spelling error and the case is different, since java is case sensitive it will take it as a different value
		
		if (str2.equals(str3)) {
			System.out.println("the two strings are EQUAL");
		
		}
		else {
			System.out.println("The two strings are NOT equal");
		}
		
		// String comparison -- NOT equal
		String str4 = "eyobe";
		String str5 = "Eyobe";
		
		if (str4.equalsIgnoreCase(str5)) {  //equalsIgnoreCase helps to ignore the case sensitiveness of Java
			System.out.println("The two strings are equal");
		}
		else {
			System.out.println("The two strings are Not equal");
		}
	
	}

}
