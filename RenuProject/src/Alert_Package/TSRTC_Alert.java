package Alert_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Alert {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		String url="https://www.google.com/search?q=apsrtc&oq=apsrtc&aqs=chrome..69i57j0l5.3082j0j4&sourceid=chrome&ie=UTF-8";
		driver.get(url);
		
	//Maximizing the Browser 
		
		driver.manage().window().maximize();
		
		//Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//<div class="ellip">Hyderabad - Vijayawada - APSRTC Official Website for Online ...</div>
		driver.findElement(By.className("ellip")).click();
		
		 
		
		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		WebElement CheckAvailabilty= driver.findElement(By.id("searchBtn"));
		CheckAvailabilty.click();
		
		//Alert is a interface in Selenium
		
		Alert alert=driver.switchTo().alert();
		
		String alertMsg=alert.getText();
		
		System.out.println(alertMsg);
		
		alert.accept();
		
		driver.quit();
		
		

		 
	}

}
