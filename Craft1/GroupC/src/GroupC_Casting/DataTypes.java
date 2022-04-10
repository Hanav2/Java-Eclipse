
						//DataTypes

// Always when we define variables we define them with a data type.
// DataTypes determine what kind of value the variables hold

			// TWO CATEGORIES OF DATA TYPE

			//Primitive Data Types

//This data types predefined in java by default, start with lowercase letter
// Must always have a value, and they are differed by the size they hold in the memory
 
/* Eg :-   Integer (byte,short,int,long) 
 * Floating point(double,float) 
 * Character(char)
 * Boolean (T,F)  
 */

package GroupC_Casting;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						//Integer
		byte a =100; //byte holds -128 to 127. we can't store more than 127 because it will be more than it's memory capacity
		System.out.println("\n Byte: " + a);
		
		short b = 200; // -32,768 to 32,767
		System.out.print("\n short: " + b);
		
		int c = 30000;   // -2,147,483,648 to 2,147,483,647
		System.out.println("\n int: " + c);
		
		long d = 334333333333l; // hold very large amount; and the end of the value we have to add l;
		System.out.println("\n long: " + d);
		
						// Floating point/Decimals
		float e = 24000.67f; // and the end of the value we have to add f;
		System.out.println("\n float: " + e);
		
		double f = 350000.50; //hold larger values than float
		System.out.println("\n double: " + f);
		
					// Boolean
		boolean value1 = true;    // stores only true or false values 
		boolean value2 = false;   // we have to mention the values as 1&2  
		
		
							//Character 
		char letter1 = 'A';          // character must be in single quotes
		System.out.println("\n char: " + letter1);
		
		char letter2 = 97;			// stores a single character/ letter or ASCII values, eg:-for a is 97 
		System.out.println("\n char: " + letter2);     
			
	}

}

					// Reference/Non primitive  Data Types
//They are created by the programmer (except string)
//start with uppercase letter
//They can be left Null
//All have the same size


//Questions 
/* At the end of the values for float we added f same as l for long, but why didn't we add d for the value of double?
*  what is the ASCII value of other letters?
* why do we use "\n" to print?
* 
*/
