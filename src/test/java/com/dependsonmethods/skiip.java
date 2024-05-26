package com.dependsonmethods;

import org.testng.annotations.Test;

public class skiip {

	@Test(dependsOnMethods = { "m2" })
	public void m1() {

		System.out.println(" i am m1 method");

	}

	@Test()
	public void m2() {

		System.out.println(" i am m2 method");
		throw new RuntimeException();

	}

	@Test
	public void m3() {

		System.out.println(" i am m3 method");

	}

}
