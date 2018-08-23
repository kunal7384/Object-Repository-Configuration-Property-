import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ConfigProperty;

public class Testpro {

	@Test
	public void test() throws IOException
	{
		ConfigProperty con = new ConfigProperty();
		
		String data = con.getApplicationUrl();
		String user= con.getId();
		String pass=con.getpassword();
		System.out.println(user);
		System.out.println(pass);
		System.out.println("Url of application ::" +data);
		WebDriver driver = new ChromeDriver();
		driver.get(con.getApplicationUrl());
		
		driver.findElement(By.xpath(con.getId())).sendKeys("don");
		driver.findElement(By.id(con.getpassword())).sendKeys("don123");
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		
	}

}
