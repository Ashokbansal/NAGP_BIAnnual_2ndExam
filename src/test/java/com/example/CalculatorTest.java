package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	Calculator calc=new Calculator();
	
	@Test
	public void testAddition()
	{
		int result=calc.add(23, 34);
		System.out.println("Addition of two numbers is : "+result);
		Assert.assertEquals(result,57);
	}
	
	@Test
	public void testSubtraction()
	{
		int result=calc.subtract(94, 39);
		System.out.println("Subtraction of two numbers is : "+result);
		Assert.assertEquals(result,55);
	}
}
