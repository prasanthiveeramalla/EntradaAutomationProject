package entrada.cloud.portal.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLandingPage {
	
	 //id :  ap_email
/*	https://www.amazon.in/

		//span[text()="Hello, Sign in"]

		input id:  ap_email


		id : continue
		ap_password

		signInSubmit*/
	
	

   public static void main(String args[]) {
	  // By ALP_Signin_ClickSignIn = By.xpath("//div[@id='nav-signin-tooltip']//span");
	   //By ALP_Signin_ClickSignIn = By.xpath("//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']");
	 
	   By ALP_Signin_ClickSignIn = By.id("nav-hamburger-menu");

	    By ALP_Signin_ClickMenu = By.id("hmenu-customer-name");

	   
		By ALP_Signin_EnterEmail = By.id("ap_email");

	    By ALP_Signin_Continue = By.id("continue");

	    By ALP_Signin_Password =By.id("ap_password");

	    By ALP_Signin_Submit = By.id("signInSubmit");
	    By ALP_Signout = By.xpath("//a[text()='Sign Out']");
	  //a[text()="Sign Out"]
	    
	   String url="https://www.amazon.in/";
	   System.setProperty("webdriver.chrome.driver","webdrivers\\chromedriver.exe");
	   AmazonLandingPage page=new AmazonLandingPage();
	   WebDriver driver;
	  driver=new ChromeDriver() ;
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement tapSignIn= driver.findElement(ALP_Signin_ClickSignIn);
	System.out.println("bef step 1");
	page.isjQueryLoaded(driver);
	tapSignIn.click();
	System.out.println("aft step 1");
	WebElement tapMenu= driver.findElement(ALP_Signin_ClickMenu);
	System.out.println("bef step 2");
	page.isjQueryLoaded(driver);
	tapMenu.click();
	System.out.println("aft step 2");
	WebElement field_enterEmail= driver.findElement(ALP_Signin_EnterEmail);
	
	
	System.out.println("step3");
	page.isjQueryLoaded(driver);
	field_enterEmail.sendKeys("bharathmadishetti@gmail.com");
	page.isjQueryLoaded(driver);
	WebElement btn_continue= driver.findElement(ALP_Signin_Continue);
	btn_continue.click();
	page.isjQueryLoaded(driver);
	WebElement field_password= driver.findElement(ALP_Signin_Password);
	field_password.sendKeys("sfqatest");
	page.isjQueryLoaded(driver);
	WebElement btn_Signin= driver.findElement(ALP_Signin_Submit);
	btn_Signin.click();
	tapMenu= driver.findElement(ALP_Signin_ClickMenu);
	System.out.println("bef step 2");
	page.isjQueryLoaded(driver);
	tapMenu.click();
	WebElement btn_Signout=driver.findElement(ALP_Signout);
	page.isjQueryLoaded(driver);
	btn_Signout.click();
	//a[text()="Sign Out"]
	
       //Closing the browser
	 driver.quit();
	   
	   
   
   
	   
	 
	   
	
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
