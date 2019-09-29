package com.BasicJava;

 
import org.openqa.selenium.opera.OperaDriver;
 
public class Facebook_login {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\siva\\Desktop\\Software Testing\\Selenium\\T.Renuka\\RenuProject\\DriverFiles\\chromedriver.exe");
		OperaDriver driver =  new OperaDriver();
		
		
	     
		String url = "htpp://www.facebook.com";
		
		driver.get(url);
		 
		
		 
	

	 
	}

}
