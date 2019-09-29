package ScreenShot_Package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Screenshot {
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		//Maximizing the Browser 
		
		driver.manage().window().maximize();
		
		//Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		 //Validation of Login Page
		
		 String actual_OHRMtitle=driver.getTitle();
		 String expected_OHRMtitle = "OrangeHRM";
		 
		 
		 if(actual_OHRMtitle.equals(expected_OHRMtitle))
		 {
			 System.out.println("Orange HRM login page SUCCESSFULLY");
			 
			 String  actual_Result=driver.getCurrentUrl();
			  System.out.println( actual_Result);
			File OrangeHRM_Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(OrangeHRM_Screenshot,new File("./ScreenShots/Orange.png"));
			
				 
			 
			 
			 
			 
			 
		 }
		 else
		 {
			 System.out.println("Orange HRM login page UNSUCCESSFULLY");
			 
		 }
		driver.quit();
	}

}
