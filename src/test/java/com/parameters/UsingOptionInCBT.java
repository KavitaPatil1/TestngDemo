package com.parameters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsingOptionInCBT {
	
	public static RemoteWebDriver driver;
	@Parameters("browsername")
	@BeforeMethod
	public void verifyTitlename(@Optional String browserName) {
		if(browserName==null)
			driver=new ChromeDriver();
		
	if(browserName.equals("Chrome")) {
		driver=new ChromeDriver();
	}else if(browserName.equals("Edge")) {
		driver=new EdgeDriver();
	}else if(browserName.equals("firefox")) {
		driver=new FirefoxDriver();
	}else {
		System.out.println("invalid browser");
	}

	}
	@Test
	public void openurl() {
      driver.get("https://www.myntra.com/");
	}

}
