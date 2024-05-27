package com.dataprovider;


import org.testng.annotations.Test;

public class Testing {
	
	
	
	@Test(dataProvider ="values" , dataProviderClass =provider.class)
	public void m1(int num1,int num2) {
		
		System.out.println("num1 is :"+ num1 + " y is : "+num2);

	}
	
}
