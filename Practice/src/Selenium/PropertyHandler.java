package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {

	public static void main(String[] args) throws IOException {
		
		System.out.println(propertyHandler("malik"));
		System.out.println(propertyHandler("breed"));

	}
	
	public static String propertyHandler(String key) throws IOException {
		Properties properties= new Properties();
		FileInputStream fis= new FileInputStream("D:\\Selenium Workspace\\Practice\\src\\test\\src\\data\\data.properties");
		
		properties.load(fis);
		String value= properties.getProperty(key);
		
		return value;
	}

}
