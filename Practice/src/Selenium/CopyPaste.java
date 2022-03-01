package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste extends LaunchDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://ww7.demoaut.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'National Standard Car Rental')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Car Rentals')]/../../div/div/a/span")).click();*/
		
		/*driver.get("https://www.orbitz.com/Cars?SEMCID=ORBITZ-US.MULTILOBC.GOOGLE.GT-c-EN.CAR&&SEMDTL=a1931647096.b145211477623.r1237d39e46cc5ee14623c5af44c8007480ef09c8fc91625bd21fd2ef779f647e0.d1260460889867.e1c.f1.g1kwd-297794332058.h1b.i1.j19040196.k1.l1s.m1.n1&gclid=EAIaIQobChMIid7-mZ6A9gIVH4ZLBR0B9Q53EAAYASAAEgLzqfD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'//a[contains(text(),'Create a free account')]')]")).click();
		Thread.sleep(2000);
		
		WebElement fName= driver.findElement(By.id("signupFormFirstNameInput"));
		fName.sendKeys("Sampad Pradhan");
		
		Actions action= new Actions(driver);
		//Copy
		action.click(fName).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Paste
		WebElement lName= driver.findElement(By.id("signupFormLastNameInput"));
		action.click(lName).keyDown(Keys.CONTROL).sendKeys("v").build().perform();*/
		
		
		driver.get("https://www.facebook.com/");
		WebElement createAccount= driver.findElement(By.xpath("//a[@role='button' and contains(text(),'Create New Account')]"));
		click(driver, createAccount, 10);
		Thread.sleep(5000);
		
		WebElement fName= driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.sendKeys("Sampad");
		
		Actions action= new Actions(driver);
		//Copy
		action.click(fName).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Paste
		WebElement lName= driver.findElement(By.xpath("//input[@name='lastname']"));
		action.click(lName).keyDown(Keys.CONTROL).sendKeys("v").build().perform();

	}

}
