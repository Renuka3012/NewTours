package com.browserLaunch.driverFiles;

import org.openqa.selenium.chrome.ChromeDriver;

public class validatingTitleGoogleHomePage {

	public static void main(String[] args) 
	{

		 String google_url="http://google.com";
		 System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get(google_url);
		 String expected_GoogleHomePageTitle="google";
		 System.out.println("the expected title of google home page is:"+expected_GoogleHomePageTitle);
		 String actual_GoogleHomePageTitle=driver.getTitle();
		 System.out.println("the actual title of google home page is:"+actual_GoogleHomePageTitle);
		 if(actual_GoogleHomePageTitle.contains(expected_GoogleHomePageTitle))
		 {
			 System.out.println("title matched-pass");
		 }
		 else
		 {
			 System.out.println("title not matched-fail");
		 }
		 driver.quit();
		 
			 
	}

}
