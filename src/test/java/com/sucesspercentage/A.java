package com.sucesspercentage;

import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

//sucess percentage always write with invocation count
public class A {
	int x = 0;

	@Test(invocationCount = 10, successPercentage = 50)
	public void m1() {
		x++;
		Assert.assertTrue(x % 2 == 0) ;
			System.out.println(" i am m1 method");
			
			
		}
	
@Test
	public void m2() {
		System.out.println("i am m2 method");
	}

@Test
public void m3() {
	System.out.println("i am m3 method");
}
@Test
public void m4() {
	System.out.println("i am m4 method");
}
}
