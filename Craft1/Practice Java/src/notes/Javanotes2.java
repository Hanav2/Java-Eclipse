   

				// Scope
/* Member Variable Scope:- It includes Instance Variable and Static Variable 
 * Method Parameter Scope:-It includes the main method and methods we created 
 * Local Variable Scope:-  It includes local variable declaration
 * Exception Handler parameter Scope:- to see the diagram?
 */



// Type Casting in Java:- Type casting is changing the value from one type to another type
// Two types of casting 

/* Widening/ Automatic Type casting :- from smaller data type to larger data type.
* In order to use this one: The two types must be compatible 
*                           The target type is larger than the source type
*---->>>>byte,short,int,long,float,long
* int a =100;
* long b = a;
*/

/* Narrowing/Explicit type conversion/casting: Assigning a larger value to a smaller type.
 * From larger to smaller
 * ---->>>>long,float,long,int,short,byte
 * double d = 100.04;
 * long l = (long)d;
 * int i = (int)l;
 * 
 * int a = 100
 * short c = (short)a;
 */



						// Operators 
/* Operators are symbols that are used to perform operation.
 *  We use operators for mathematical purposes.
 *  An Operator performs a function on one, two, or three operands. a + b:- this is two operands, characters on the right and left side of the operator.
 */
			// Here they are listed by the presidency 

			//Unary Operators:- postfix: Expression ++  Expression --      ++ is incremental     -- is decremental
										//	Prefix: ++ Expression   -- Expression +Expression  -Expression ~!

			//Arithmetic Operator: +,-,*,/,%(modulus)

			// Shift Operator: shift: <<  >>  >>>
						
			// Relational Operators: Comparison: <  >  <=  >= instanceof  , Equality: == !=

			// Bitwise Operator: bitwise AND: & , bitwise exclusive OR: ^, bitwise inclusive OR:|


			//Logical Operators: Logical AND: && (this will be true if both of the operands are true) , Logical OR: || (it will be false only when both of the operands are false)     we can use them with different operators. we use if statement

			//Ternary or Conditional Operators: Ternary: ( ?:) It is short hand operator for if, else statement  eg:-  double mark=70;   String result = (mark >65)?"first Division" : "Second Division"  if the result is correct it will take the division after the questionmark but if it not correct it will take the : colon

			//Assignment Operators: Assignment: = += -= *= /= %= &= ^= |= <<= >>= >>>=




// example of unary poerators; x++; postfix incremental   ++x; prefix incremental   x--; postfix decremental --x; prefix decremental;
// ++ is adding one.   -- is subtracting 1
package notes;

public class Javanotes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
