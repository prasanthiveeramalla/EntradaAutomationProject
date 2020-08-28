package entrada.cloud.portal.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.WebActions;

public class MercuryHomePage {

	public  WebDriver driver;

	public static   String url="http://demo.guru99.com/test/newtours/index.php";

	//Verify Header Links and navigation

	//Verify NavigationBar Links and navigation

	//verify Table

	public   By HeaderLinks_SignOn = By.xpath("//a[text()='SIGN-ON']");
	public   By HeaderLinks_Register = By.xpath("//a[text()='REGISTER']");
	public  By HeaderLinks_Support = By.xpath("//a[text()='SUPPORT']");
	public  By HeaderLinks_Contact = By.xpath("//a[text()='CONTACT']");

	public   By navigationBarLinks_Home = By.xpath("//td//a[text()='Home']");
	public   By navigationBarLinks_Flights = By.xpath("//td//a[text()='Flights']");
	public   By navigationBarLinks_Hotels = By.xpath("//td//a[text()='Hotels']");
	public   By navigationBarLinks_CarRentals = By.xpath("//td//a[text()='Car Rentals']");
	public   By navigationBarLinks_Cruises = By.xpath("//td//a[text()='Cruises']");
	public   By navigationBarLinks_Destinations = By.xpath("//td//a[text()='Destinations']");
	public   By navigationBarLinks_Vacations = By.xpath("//td//a[text()='Vacations']");
	
	
	//Sign On PAGE
	
	//Register Page
	
	
	public MercuryHomePage(WebDriver driver) {
		this.driver=driver;
	}



	
	
	public void testRegisterSuccess() {
		
	}
	
	
	
	public void testHeaderLinks() {
		//WebActions actions=new WebActions();
		WebActions.verifyElementExists(driver,HeaderLinks_SignOn);
		WebActions.verifyElementExists(driver,HeaderLinks_Register);
		WebActions.verifyElementExists(driver,HeaderLinks_Support);
		WebActions.verifyElementExists(driver,HeaderLinks_Contact);

	}
	public void testNavigationBarLinks() {
		//WebActions actions=new WebActions();
		WebActions.verifyElementExists(driver,navigationBarLinks_Home);
		WebActions.verifyElementExists(driver,navigationBarLinks_Flights);
		WebActions.verifyElementExists(driver,navigationBarLinks_Hotels);
		WebActions.verifyElementExists(driver,navigationBarLinks_CarRentals);
		WebActions.verifyElementExists(driver,navigationBarLinks_Cruises);
		WebActions.verifyElementExists(driver,navigationBarLinks_Destinations);
		WebActions.verifyElementExists(driver,navigationBarLinks_Vacations);


	}
	public void clickHPRegisterLink() {
		//WebActions actions=new WebActions();
		WebActions.clickOnElement(driver, HeaderLinks_Register);
	}
	
	public void testTableData() {

	}

//comment 1
	//comment 2
	//comment 3
	
	//comment 1 from local
		//local comment 2
		//local comment3


}
