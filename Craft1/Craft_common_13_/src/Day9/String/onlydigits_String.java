package Day9.String;

public class onlydigits_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "s587423196sws";
		
		  char ch;  //we assigned ch for the string
		  
		  for(int i = 0;i<str1.length();i++){ //we declare the value using for loop
			  
		       ch = str1.charAt(i);
		       
		       System.out.println(ch);
		       
		       if(Character.isDigit(ch)){  // we can use if digit or if letter
		    	   
		          continue;  //question doesn't we say we will skip one and continue?? I don't understand why we used continue here.
		          }
		        else{
		          System.out.println("String contains letters");
		         }
		}

		  
		  
			String str2 = "fesyur785";
			
			  char li;  //we assigned li for the string
			  
			  for(int i = 0;i<str2.length();i++){ //we declare the value using for loop
				  
			       li = str2.charAt(i);
			       
			       System.out.println(li);
			       
			       if(Character.isLetter(li)){  // isletter if it is letter it will continue to print it then for the numbers it will print the number and add strings contains non letters under it
			    	   
			          continue;  //question doesn't we say we will skip one and continue?? I don't understand why we used continue here.
			          }
			        else{
			          System.out.println("String contains Non letters");
			         }
			}

	}

}
