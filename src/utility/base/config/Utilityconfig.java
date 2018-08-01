package utility.base.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilityconfig {
	
	File file;
	FileInputStream fis;
	Properties pro;
	
	
	public Utilityconfig()
	{
	try {
		file = new File(".//properties//properties.config");
		fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);

	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	
	}
	public String getApplicationUrl()
	{
		return pro.getProperty("url");
		
	}
	public String getuserName()
	{
		return pro.getProperty("pad.username.id");
		
	}
	public String getpassword()
	{
		return pro.getProperty("pad.password.id");
		
	}
}
