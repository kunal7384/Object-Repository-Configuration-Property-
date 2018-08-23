package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {
File file;
FileInputStream fis;
Properties pro;
	public  ConfigProperty() throws IOException
	{
		 file = new File(".//property//property.config");
		 fis = new FileInputStream(file);
	 pro = new Properties();
		pro.load(fis);
		
	}
	
	public String getApplicationUrl()
	{
		return pro.getProperty("URL");
		
	}
	
	public String getId()
	
	{
		
	String u =	pro.getProperty("Username");
		
		return pro.getProperty("Edu.login.emailid.xpath");
		
		
	}
	public String getpassword()
	{
		return pro.getProperty("Edu.login.password.id");
		
		
		
	}
}
