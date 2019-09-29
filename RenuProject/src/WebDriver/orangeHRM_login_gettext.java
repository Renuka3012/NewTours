package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRM_login_gettext {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		// <input name="txtUsername" id="txtUsername" type="text">
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				
				
				//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			  WebElement   password=driver.findElement(By.id("txtPassword"));
			  password.sendKeys("admin123");
			  
			  //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			  WebElement   loginButton=driver.findElement(By.id("btnLogin"));
			  loginButton.click();
			  
			 
			  
			 
			//	WebElement  Admin_name = driver.findElement( By.xpath("//*[text()='Admin']"));
						
				String Admin_name_text=driver.findElement( By.xpath("//*[text()='Admin']")).getText();
				System.out.println(Admin_name_text);
				driver.quit();
				

	}

}




