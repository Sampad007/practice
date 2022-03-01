package Selenium;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload extends LaunchDriver{

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/");
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement signIn= driver.findElement(By.linkText("Sign in"));
			signIn.click();
			//click(driver, signIn, 10);
			
			driver.findElement(By.id("identifierId")).sendKeys("sampad.pradhan007@gmail.com");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys("omsrisainathayanamah");
			driver.findElement(By.id("passwordNext")).click();
			
			Thread.sleep(5000);
			
			//Remove prompt to remember password
			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			
			//Compose
			driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3' and @role='button']")).click();
			Thread.sleep(3000);
			
			//Attachment
			driver.findElement(By.id(":t9")).click();
			
			//Upload a file
			//Copy
			StringSelection copyPath= new StringSelection("..\\Practice\\src\\test\\src\\data\\data.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyPath, null);
			
			//Paste
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (HeadlessException | AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
