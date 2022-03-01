package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon extends LaunchDriver{

	static WebDriver driver=null;
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			WebElement search= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
			sendkeys(driver, search, "phones", 10);
			search.sendKeys(Keys.ENTER);
			
			WebElement resolutionSelection= driver.findElement(By.xpath("//span[contains(text(),'1280 x 720')]"));
			click(driver, resolutionSelection, 10);
			Thread.sleep(3000);
			WebElement resolutionSelection1= driver.findElement(By.xpath("//span[contains(text(),'1280 x 720')]"));
			isSelected(driver, resolutionSelection1, 10);
			System.out.println(resolutionSelection1.isSelected());
			
			
			
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void isSelected(WebDriver d, WebElement e, int timeout) {
		System.out.println("Methid Overriden");
	}

}
