package Day9.String;

public class subString {

	public static void main(String[] args) {
		
		// The concept of substring is when we give it a substring it will bring the string of the index we give it and all the characters after it.
				//from the string we can get the substring
	
		String str1 = "Today is holiday. Tomorrow is working day.";
		int loc= str1.indexOf("holiday");
		System.out.println("position of holiday: " + loc);
		
		
		String sub1 = str1.substring(8); // this is the index 8 so it will bring everything after the 8 index
		System.out.println("substring: " + sub1);
	

}
}