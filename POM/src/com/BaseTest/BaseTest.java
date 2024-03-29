package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver = null;
	public String url="http://www.newtours.demoaut.com/";
	
	@BeforeMethod
	public void SetUp()
	{
	System.setProperty("webdriver.chrome.driver", ".POM/DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	
	//Maximizing the Browser 
	
	driver.manage().window().maximize();
	
	//Implicit wait 
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
