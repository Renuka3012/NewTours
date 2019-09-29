package com.BasicJava;


import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConcept {

	public static void main(String[] args)
	{
		String url="http://www.facebook.com";
		System.setProperty("webdriver.gecko.driver", "C://Users//siva//Desktop//Software Testing//Selenium//T.Renuka//RenuProject//DriverFiles//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(url);
		String FbTitle = driver.getTitle();
		System.out.println(FbTitle);	
		
		/*
		 * Inspection code from source code available on web application
		 * 
		 * <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		 * 
		 * 
		 */
		
		driver.findElementById(("email")).sendKeys("renukamohan58@gmail.com");
		driver.findElementById(("pass")).sendKeys("08062008");
		driver.findElementById(("loginbutton")).click();
		driver.close();
		
		 
		
		
		
		
		
		
	 
		
	}

}
