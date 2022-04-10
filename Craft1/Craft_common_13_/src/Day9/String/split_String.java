package Day9.String;

public class split_String {

	public static void main(String[] args) {
		
// It is used to split string using Array
		
		String str1 = "Today is holiday. Tomorrow is working day.";
		
		int loc= str1.indexOf("holiday");
		
		System.out.println("position of holiday: " + loc);
		
		
		String sub1 = str1.substring(8); // this is the index 8 so it will bring everything after the 8 index
		
		System.out.println("substring: " + sub1);
	

		String[] arry = str1.split(" ");
		
		for(String elt: arry) {  // this will split each words using space and using multiple line for each words
			System.out.println(elt);
		}
	}

}
