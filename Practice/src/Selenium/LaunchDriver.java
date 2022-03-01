package Selenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchDriver {
	static WebDriver driver=null;
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement userName= driver.findElement(By.id("email"));
		sendkeys(driver, userName, "coolsampi007@gmail.com", 10);
		
		WebElement password= driver.findElement(By.id("pass"));
		sendkeys(driver, password, "omsrisainathayanamah", 10);
		
		WebElement login= driver.findElement(By.name("login"));
		click(driver, login, 10);
		//DriverManager manager= new ChromeDriver(capabilities);
		
		Thread.sleep(20000);
		System.out.println("Alert: "+driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
		String url= driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
		String title= driver.getTitle();
		System.out.println("Page Name is: "+title);
		
		if(url.equalsIgnoreCase("https://www.facebook.com/")) {
			if(title.contains("Facebook")) {
				System.out.println("Logged in Successfully");
				System.out.println("Test case passed");
			} else {
				System.out.println("Not yet Logged in");
			}
		}
		logoutandclose(driver);
	}
	
	@FindBy(xpath="//class[@role='button']/svg/path")
	static WebElement button;
	
	public static WebElement getButton() {
		return button;
	}

	@SuppressWarnings("deprecation")
	public static void sendkeys(WebDriver d, WebElement e, String value, int timeout) {
		try {
			if(value!=null) {
				new WebDriverWait(d, timeout).until(ExpectedConditions.visibilityOf(e));
				e.clear();
				e.sendKeys(value);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void click(WebDriver d, WebElement e, int timeout) {
		try {
			new WebDriverWait(d, timeout).until(ExpectedConditions.visibilityOf(e));
			if(e.isEnabled()) {
				e.click();
			} else {
				System.out.println("Fill up all Mandatory fields");
			}
		} catch (NoSuchElementException e1){
			System.out.println(e1.getMessage());
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void isSelected(WebDriver d, WebElement e, int timeout) {
		try {
			new WebDriverWait(d, timeout).until(ExpectedConditions.visibilityOf(e));
			if(e.isDisplayed()) {
				System.out.println(e.getText().trim()+"is displayed");
				if(e.isSelected()) {
					System.out.println(e.getText().trim()+"is selected.");
				} else {
					System.out.println(e.getText().trim()+"is not selected");
				}
			} else {
				System.out.println(e.getText().trim()+"is not displayed");
			}
		} catch (Exception ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void waitforElementVisibility(WebDriver d, WebElement e, int timeout) {
		new WebDriverWait(d, timeout).until(ExpectedConditions.visibilityOf(e));
	}
	
	public static void logoutandclose(WebDriver d) {
		//button.click();
		click(d, getButton(), 10);
		//driver.close();
	}
	
}
