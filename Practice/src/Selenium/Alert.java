package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.Keyboard;

public class Alert extends LaunchDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		
		Thread.sleep(3000);
		
		WebElement close= driver.findElement(By.cssSelector("div#corover-close-btn"));
		close.click();
		
		Thread.sleep(2000);
		WebElement searchButton= driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]"));
		searchButton.click();
		
		Thread.sleep(5000);
		System.out.println("Alert: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
