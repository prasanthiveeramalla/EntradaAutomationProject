package entrada.cloud.portal.pages;

import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLoginPage {
	
	 public static void main(String args[]) throws InterruptedException {
	//locators
		  By btnSignIn = By.xpath("//div/a[text()='Login']");

		    By alertFieldUN= By.xpath("//input[@class='_2zrpKA _1dBPDZ']");

		   
			By alertFieldPwd = By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");

		    By alertBtnLogin = By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");

		    By fieldSeacrh =By.xpath("//form[@action='/search']//input[@class='LM6RPg']");

		    String url="https://www.flipkart.com/";
			   System.setProperty("webdriver.chrome.driver","webdrivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver() ;
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get(url);
		  
		  WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement we_btnSignIn= driver.findElement(btnSignIn);
			System.out.println("bef step 1");
			FlipkartLoginPage page=new FlipkartLoginPage();
			page.isjQueryLoaded(driver);
			we_btnSignIn.click();
			page.isjQueryLoaded(driver);
			Thread.sleep(1000);
			WebElement we_alertFieldUN= driver.findElement(alertFieldUN);
			wait.until(ExpectedConditions.elementToBeClickable(we_alertFieldUN));
			//we_alertFieldUN.click();
			we_alertFieldUN.clear();
			we_alertFieldUN.sendKeys("prasanthi.v502@gmail.com");
			WebElement we_alertFieldPwd= driver.findElement(alertFieldPwd);
			we_alertFieldPwd.sendKeys("Entarad@1");
			System.out.println("bef alert btn click");
			WebElement we_alertBtnLogin= driver.findElement(alertBtnLogin);
			we_alertBtnLogin.click();
			
			
			WebElement we_fieldSeacrh= driver.findElement(fieldSeacrh);
			we_fieldSeacrh.sendKeys("Mobile");
		 
	 
	 }
	 
	 public void isjQueryLoaded(WebDriver driver) {
		   try {
	       System.out.println("Waiting for ready state complete");
	       (new WebDriverWait(driver, 30)).until(new ExpectedCondition<Boolean>() {
	           public Boolean apply(WebDriver d) {
	               JavascriptExecutor js = (JavascriptExecutor) d;
	               String readyState = js.executeScript("return document.readyState").toString();
	               System.out.println("Ready State: " + readyState);
	               return (Boolean) js.executeScript("return !!window.jQuery && window.jQuery.active == 0");
	           }
	       });
	   
	   }
	   catch(Exception e) {
		  System.out.println("prasanthi: "+e.getMessage()); 
	   }
	}
	

}
