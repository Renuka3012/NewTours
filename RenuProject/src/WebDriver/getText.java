package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		// WebElement loginPanelElement = driver.findElement(By.id("logInPanelHeading"));
		String loginPanelElementtext=driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println(loginPanelElementtext);
		driver.quit();
		
		
		
		
		
		
	
		 
	}

}
