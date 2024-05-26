package com.dependsonmethods;

import org.testng.annotations.Test;

///if depends method skip then run test case using always run tag
public class notSkippi {

	@Test(dependsOnMethods= {"m2"} ,alwaysRun =true)
	public void m1() {

		System.out.println(" i am m1 method");
		throw new RuntimeException();

	}

	@Test
	public void m2() {

		System.out.println(" i am m2 method");

	}

	@Test
	public void m3() {

		System.out.println(" i am m3 method");

	}

}
