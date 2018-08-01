package ConfigFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestConfig {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties pro;
	
	@Test
	public void configLogin()
	{
		
		try {
			file = new File(".//properties//properties.config");
			fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		 
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		driver = new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.findElement(By.id(pro.getProperty("pad.username.id"))).sendKeys(pro.getProperty("username"));
	
		driver.findElement(By.id(pro.getProperty("pad.password.id"))).sendKeys(pro.getProperty("password"));
	    driver.findElement(By.xpath("//*[@value='Login']")).click();
	
	}
	
	
	
	

}
