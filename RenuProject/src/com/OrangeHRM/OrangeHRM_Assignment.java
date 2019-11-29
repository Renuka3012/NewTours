package com.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Assignment {

	public static void main(String[] args) throws InterruptedException
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
		 }
		 else
		 {
			 System.out.println("Orange HRM login page UNSUCCESSFULLY");
			 
		 }
		
		 // Login OrangHRM with valid data 
		 
		 // <input name="txtUsername" id="txtUsername" type="text">
		 
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB).perform();
				actions.sendKeys("admin123").perform();
				actions.sendKeys(Keys.ENTER).perform();
				
		// Validation of OrangeHRM Home Page
				
				 
			//	<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
				
				WebElement actual_OHRM_HomePage_title	=driver.findElement(By.linkText("Welcome Admin"));
				String actual_OHRM_HomePage_title_text=actual_OHRM_HomePage_title.getText();
				
				
				String expected_OHRM_HomePage_title="Admin"; 
				
				if(actual_OHRM_HomePage_title_text.contains(expected_OHRM_HomePage_title))
				{
					System.out.println("Successfully Login to OrangeHRM Home Page");
				}
				else
				{
					System.err.println("Unsuccessfully Login to OrangeHRM Home Page");
				}
				
				
				// Automate PIM Element
				//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
				
				WebElement PIM_Element=driver.findElement(By.linkText("PIM"));
				PIM_Element.click();
				
				Thread.sleep(10000);
				
			
				// Automate ADD EMPLOYEE Element
				
				//  <a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
				
				WebElement AddEmployee_Element=driver.findElement(By.linkText("Add Employee"));
				AddEmployee_Element.click();
				Thread.sleep(10000);
				
				//Validation of Add Employee Web Page
				
		
				
				String actual_AddEmployee_CurrentUrl =driver.getCurrentUrl();
				System.out.println("The CurrentUrl of WebPage is " +actual_AddEmployee_CurrentUrl);
				
				String expected_AddEmployee_CurrentUrl="addEmployee";
				
				if(actual_AddEmployee_CurrentUrl.contains(expected_AddEmployee_CurrentUrl))
				{
					System.out.println("Successfully Automate AddEmployee Element");
				}
				else
				{
					System.out.println("UnSuccessfully Automate AddEmployee Element");//hiiii

									
				}
				
				//Registration a NEW EMPLOYEE
				
				//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
				
			WebElement	FirstName_Element =driver.findElement(By.id("firstName"));
			FirstName_Element.sendKeys("Renuka");
			
			actions.sendKeys(Keys.TAB).perform();
			actions.sendKeys(Keys.TAB).perform();
			actions.sendKeys("Tirumalasetty").perform();
			actions.sendKeys(Keys.TAB).perform();
			Thread.sleep(10000);
			
			
			
			//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0086" id="employeeId">
			
			WebElement EmployeeId=driver.findElement(By.id("employeeId"));
			String Expected_EmployeeId=EmployeeId.getAttribute("value");
			
			System.out.println("The Employee Id is " + Expected_EmployeeId);


			
			
			
			
			//Save Employee Details
			//<input type="button" class="" id="btnSave" value="Save">
			
			WebElement AddEmployee_SaveButton=driver.findElement(By.id("btnSave"));
			AddEmployee_SaveButton.click();
			
			//Logout of OrangeHRM
			//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
			
			WebElement WelcomeAdminElement=driver.findElement(By.id("welcome"));
			WelcomeAdminElement.click();
			Thread.sleep(10000);
			
			//<a href="/index.php/auth/logout">Logout</a>
			WebElement LogOut=driver.findElement(By.linkText("Logout"));
			LogOut.click();
			
			Thread.sleep(5000);
			
			
			
			driver.quit();
			
			
			
	 
		
				
		 
		 
		 
		 
		 
				
	}

}
