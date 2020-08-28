package common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebActions {
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		return driver;
				
	}
	public void launchURL(WebDriver driver, String url) {
		Reporter.log("Launching url: "+url , true);
		waitForSomeTime(driver, 30);
		driver.get(url);
			
		}
	public void CloseDriver(WebDriver driver) {
		driver.close();
		
		
	}

	public  boolean verifyElementExists(WebDriver driver,By locator) {
		try {
			Reporter.log("Element locator :"+locator.toString());
			waitForSomeTime(driver, 60);
			WebElement element= driver.findElement(locator);
			element.isDisplayed();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	public  void clickOnElement(WebDriver driver, By locator) {
		try {
			waitForSomeTime(driver, 60);
			WebElement element= driver.findElement(locator);
			element.click();
			System.out.println("Element clicked");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public  void EnterValue(WebDriver driver,By locator, String txt) {
		try {
			waitForSomeTime(driver, 60);
			WebElement element= driver.findElement(locator);
			element.sendKeys(txt);
			System.out.println("Entered text: " + txt);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	public void  waitForSomeTime(WebDriver driver, long time){
		new WebDriverWait(driver, time).until(abc->((JavascriptExecutor)abc).executeScript("return document.readyState").equals("complete"));
		
	}
	
	public void gf_SelectbyValue(WebDriver driver,By locator, String val) {
		WebElement element= driver.findElement(locator);
		Select dropDown=new Select(element);
		dropDown.selectByValue(val);
		/*List<WebElement> options= dropDown.getOptions();
		
		for(WebElement webElement: options) {
			webElement.se
		}*/
	}

}
