package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchField= driver.findElement(By.name("q"));
		
		searchField.click();
		searchField.sendKeys("Dog");
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	/*@FindBy(name="q")
	static WebElement searchField;

	public static WebElement getSearchField() {
		return searchField;
	}*/
	
	

}
