package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDown extends LaunchDriver {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement createAccount= driver.findElement(By.xpath("//a[@role='button' and contains(text(),'Create New Account')]"));
			click(driver, createAccount, 10);
			
			Thread.sleep(5000);
			WebElement date= driver.findElement(By.cssSelector("select[id='day']"));
			waitforElementVisibility(driver, date, 10);
			
			Select day= new Select(date);
			day.selectByIndex(12);
			System.out.println(date.getAttribute("value"));
			day.selectByValue("15");
			System.out.println(date.getAttribute("value"));
			day.selectByVisibleText("17");
			System.out.println(date.getAttribute("value"));
			
			List<WebElement> option= day.getOptions();
			for(int i=0; i<option.size(); i++) {
				System.out.println("Options are: "+option.get(i).getText());
				day.selectByValue(option.get(i).getText());
				//option.get(i).click();
			}
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
			e.printStackTrace();
		}

	}

}
