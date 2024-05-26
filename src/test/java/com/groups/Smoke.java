package com.groups;

import org.testng.annotations.Test;

public class Smoke {

	@Test(groups = { "Smoke", "Regression" })
	public void m1() {

		System.out.println("i am m1 method");

	}

	@Test(groups = { "Smoke" })
	public void m2() {

		System.out.println(" i am m2 method");
	}

	@Test(groups = { "Smoke" })
	public void m3() {
		System.out.println("  i am m3 method");

	}
}
