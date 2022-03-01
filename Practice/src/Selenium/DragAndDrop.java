package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(6000);
		
		driver.switchTo().frame(0);
		
		WebElement src= driver.findElement(By.id("draggable"));
		WebElement tgt= driver.findElement(By.id("droppable"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(src, tgt).perform();
		
		if (tgt.getText().equalsIgnoreCase("Dropped!")) {
			System.out.println("Drag and Drop successful");
		} else {
			System.out.println("Drag and Drop unsuccessful");
		}

	}

}
