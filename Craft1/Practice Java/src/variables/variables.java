package variables;

import static org.junit.Assert.*;


import org.junit.Test;

import junit.framework.Assert; // for this we have to use Assert.assertEquals(3.3, c.division(33, 10));

public class variables {

//	
//	public void test() {
//		fail("Not yet implemented");
	
	calc c = new calc();  //here we have to put the name of the class we write our code. on this case calc


	@Test 
	public void divTest() {
		Assert.assertEquals(3.3, c.division(33, 10));
	}
	
	@Test
	public void mulTest() {
		Assert.assertEquals(120, c.multiplication(12, 10));
		
	
}
	@Test
	public void addTest() {
		
		Assert.assertEquals(30.0, c.addition(15, 15));
	}
	
	@Test 
	public void subTest() {
			Assert.assertEquals(13, c.subtraction(15, 2));
			
	}

	public static void main(String[] args) {
		
	}
}
// NOTE

//Steps

// once we are done writing our test we click RunAs-->Junit Testing . we dont use run as java.

// once we run it if it is green line that means it passes the test case. 
// But if the line is red that means the test case is failed. because the expected value and the actual value on the assertEquals doesn't match.
// If the decimal .0 matters if it doesn't match exactly the test case will fail.




