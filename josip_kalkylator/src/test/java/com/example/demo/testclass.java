package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testclass {

private calcController sut;
	
	@Before
	public void setUp() {
		sut = new calcController();
	}
	
	@Test
	public void testAddSucsess() {
		int val1 = 5;
		int val2 = 6;
		String operator = "plus";
		
		String answer = sut.addition(Integer.toString(val1), Integer.toString(val2) , operator);
		int actual = Integer.parseInt(answer);
		
		int expeted = val1 + val2;
		
		assertEquals(expeted, actual);
	}


}
