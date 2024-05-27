package com.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class A {
	int x = 0;

	@Parameters("X")
	@Test
	public void m1(String x) {
		System.out.println(x);
	}

}
