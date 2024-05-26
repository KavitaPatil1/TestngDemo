package com.twoclassrunsame;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeSuit {

	@BeforeSuite
	public void m5() {

		System.out.println("before suit");

	}

	@BeforeTest
	public void m6() {
		System.out.println("Before test");
	}

}
