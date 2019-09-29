package orangehrm_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Orange_MultipleData {

	 
		
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	 
		@BeforeTest()
		public void SetUp()
		{
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		//Maximizing the Browser 
		
		driver.manage().window().maximize();
		
		//Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@AfterTest()
		public void TearDown()
		{
			driver.quit();
			
		}
		
			
	}


