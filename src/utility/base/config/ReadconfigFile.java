package utility.base.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadconfigFile {
	WebDriver driver;
	@Test
	
	public void readConfigData()
	{
		Utilityconfig con = new Utilityconfig();	
		
	driver= new ChromeDriver();
	
	driver.get(con.getApplicationUrl());
	driver.findElement(By.id(con.getuserName())).sendKeys("don");
	driver.findElement(By.id(con.getpassword())).sendKeys("don123");
	driver.findElement(By.xpath("//*[@value='Login']")).click();
		
	}

}
