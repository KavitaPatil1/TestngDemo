package com.dependsonmethods;

import org.testng.annotations.Test;

//Question:  mananger said  run that test cases in sequence order without using priority
public class A {
	@Test(dependsOnMethods= {"m2"})
	public void m1() {

		System.out.println(" i am m1 method");
	}

	@Test(dependsOnMethods= {"m3"})
	public void m2() {

		System.out.println(" i am m2 method");
	}

	@Test(dependsOnMethods= {"m4"})
	public void m3() {

		System.out.println(" i am m3 method");
	}

	@Test(dependsOnMethods= {"m5"})
	public void m4() {

		System.out.println(" i am m4 method");
	}

	@Test()
	public void m5() {

		System.out.println(" i am m5 method");
	}

}
