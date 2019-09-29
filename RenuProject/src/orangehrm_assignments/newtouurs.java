package orangehrm_assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newtouurs {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=null;
		String url="http://www.newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		//Maximizing the Browser 
		
		driver.manage().window().maximize();
		
		//Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\siva\\Desktop\\Software Testing\\Selenium\\T.Renuka\\RenuProject\\src\\NewTours_Details\\NewTours_REGISTERForm.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
	int rowCount=sheet.getLastRowNum();
	
	for (int i =1;i<rowCount;i++)
      {
		 Row row=sheet.getRow(i);
		 Cell cell=row.getCell(1);
		 String data=cell.getStringCellValue();
		 
		 
		 System.out.println(data);

	
	 
	//	<a href="mercuryregister.php">REGISTER</a>
	
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	
	//<input maxlength="60" name="firstName" size="20">
	driver.findElement(By.name("firstName")).sendKeys(data);
	Actions action = new Actions(driver);
	//FirstName.clear();
	//FirstName.sendKeys("Shiva");
	Thread.sleep(10000);
	action.sendKeys(Keys.TAB).perform();;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	action.sendKeys(Keys.TAB).perform();;;
	action.sendKeys(data).perform();;;
	
	
	
	//<input type="image" name="register" src="/images/forms/submit.gif" width="60" height="23" border="0">
	

	
	driver.findElement(By.name("register")).click();
      }
	
	
	
	
	
	
	
	FileOutputStream file1 = new FileOutputStream("C:\\Users\\siva\\Desktop\\Software Testing\\Selenium\\T.Renuka\\RenuProject\\src\\NewTours_Details\\NewTours_REGISTERForm.xlsx");
	workbook.write(file1);
	
	
		
		
		
		
		
		
		
		}
	
	
	

}