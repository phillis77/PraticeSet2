package base;

import static org.junit.Assert.*;

import base.MyInteger;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void testEven() {
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isEven());
	}
	
	public void testOdd() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isEven());
	}
	
	public void testPrime() {
		MyInteger myInt = new MyInteger(23);
		assertTrue(myInt.isPrime());
	}
	
	public void testEqual() {
		MyInteger myInt = new MyInteger(13);
		assertTrue(myInt.isEquals(myInt));
	}

}
