package com.browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		//navigate orangehrm application
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 //Login to orangehrm application
		//<input name="txtUsername" id="txtUsername" type="text">
		 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		  String actual_ohrmurl=driver.getCurrentUrl();
		
		
		
		driver.quit();
	
	}
}


