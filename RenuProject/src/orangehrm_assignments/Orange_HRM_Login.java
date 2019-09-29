package orangehrm_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Login {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		  
		// Login of OrangeHRM Application
			// <input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	  WebElement   password=driver.findElement(By.id("txtPassword"));
	  password.sendKeys("admin123");
	  
	  //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	  WebElement   loginButton=driver.findElement(By.id("btnLogin"));
	  loginButton.click();
	 /* 
	  
		//validate Home Page of Orange HRM application
	  
		String HRM_Title = driver.getTitle();		
	    System.out.println("The Title of Current Web Page : " +HRM_Title);
	    
	    if(url.equalsIgnoreCase(HRM_Title))
	    {
	    	System.out.println("Succesfully login into Orange HRM Web Page");
	    	
	    }
	    else
	    {
	    	System.out.println("UnSuccesfully login into Orange HRM Web Page");
	    	
	    	*/
	  
	  
	  
	  String expected_HomePageTitle="OrangeHRM";
	  System.out.println("The Expected Title is " +expected_HomePageTitle);
	  String actual_HomePageTitle=driver.getTitle();
	  System.out.println("The actual Title is " + actual_HomePageTitle);
	  
	  
	  if(actual_HomePageTitle.equals(expected_HomePageTitle))
	    {
	    	System.out.println("Succesfully login into Orange HRM Web Page");
	    	
	    }
	    else
	    {
	    	System.out.println("UnSuccesfully login into Orange HRM Web Page");
	    	
	    }
	     //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
	    	
	    	
	    	
	    	WebElement Welcome_Admin = driver.findElement(By.linkText("Welcome Admin"));
	    	Welcome_Admin.click();
	    	
	    	//<a href="/index.php/auth/logout">Logout</a>
	    	
	        WebElement Log_Out = driver.findElement(By.linkText("Logout"));
	    	Log_Out.click();
	    	
	    	driver.close();
	    	
	    	
	  
	  
	  
	  
	  
	    
	    
	    
	    
	    
		 
		
		
		
	}

}
