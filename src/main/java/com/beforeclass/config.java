package com.beforeclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class config {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println(" before Suit");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println(" Before Class");
	}

}
