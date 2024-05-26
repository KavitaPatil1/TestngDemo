package com.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Equal {
	
public static	RemoteWebDriver driver;
	@Test
	public  void openBrowser() {
    driver=new ChromeDriver();
    driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9867543");
    driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
    String exp=driver.findElement(By.xpath("//div[@class=\"errorContainer\"]")).getText();
    Assert.assertFalse(exp.isEmpty());
	}
	
	////TRue assert check
	@Test
	public  void openBrowser1() {
    driver=new ChromeDriver();
    driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9867543");
    driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
    String exp=driver.findElement(By.xpath("//div[@class=\"errorContainer\"]")).getText();
    Assert.assertTrue(exp.length()>0);
	}
	
	
	//assert equal
	@Test
	public  void openBrowser2() {
    driver=new ChromeDriver();
    driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
    String exp="Please enter a valid mobile number (10 digits)";
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9867543");
    driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
    String act=driver.findElement(By.xpath("//div[@class=\"errorContainer\"]")).getText();
    Assert.assertEquals(exp,act);
	}

}
