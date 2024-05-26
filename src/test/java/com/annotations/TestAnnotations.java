package com.annotations;

import org.checkerframework.checker.units.qual.m2;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test//if we write @Test annotaion befor class then all method of that class is test case and run and pass all methods
public class TestAnnotations {

	//@Test                 //only m1 method run if we write @Test annotaion before method 
	public void m1() {
		System.out.println(" i am m1 method");

	}

	public void m2() {
		System.out.println(" i am m2 method");
		Assert.assertEquals(false, null);
	}
	

}
