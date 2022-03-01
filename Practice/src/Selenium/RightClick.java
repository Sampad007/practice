package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName= driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		
		Actions action= new Actions(driver);
		action.moveToElement(userName).click().sendKeys("coolsampi007@gmail.com").build().perform();
		action.moveToElement(password).click().sendKeys("omsrisainathayanamah").build().perform();
		
		action.moveToElement(password).contextClick().build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		action.sendKeys(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

	}

}
