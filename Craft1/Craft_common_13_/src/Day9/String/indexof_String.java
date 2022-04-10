package Day9.String;

public class indexof_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1  =  "Today is Holiday. Tomorrow is working day.";
				
				int loc = str1.indexOf("Holiday"); // when we use indexof it will print the index of the String
				
				System.out.println("Position of holiday: " + loc); // This is printing the position of H (Holiday) on the index
				
				int s = str1.indexOf('T', 5);
	
				System.out.println("Position of holiday: " + s);
	
				System.out.println(str1.length()); // This prints the full index length of "Today is Holiday. Tomorrow is working day."
	}

}
