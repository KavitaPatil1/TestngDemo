package com.util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static RemoteWebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//driver.manage().window().setSize(new Dimension(1024,768));
		driver.manage().window().maximize();
		

	}
	@AfterMethod
	public void tearDown() {
		driver.close();

	}
	

}
