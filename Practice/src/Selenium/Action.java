package Selenium;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName= driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		WebElement login= driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		
		Actions action= new Actions(driver);
		action.moveToElement(userName).click().sendKeys("coolsampi007@gmail.com").build().perform();
		action.moveToElement(password).click().sendKeys("omsrisainathayanamah").build().perform();

		/*int x= login.getLocation().getX();
		int y= login.getLocation().getY();
		action.moveByOffset(x, y).click().build().perform();*/
		
	    action.moveToElement(login).click().build().perform();
		//action.click(login).build().perform();
	}

}
