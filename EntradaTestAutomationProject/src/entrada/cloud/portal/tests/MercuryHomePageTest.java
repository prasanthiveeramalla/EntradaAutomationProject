package entrada.cloud.portal.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.WebActions;
import entrada.cloud.portal.pages.MercuryHomePage;

public class MercuryHomePageTest {
	
	private WebDriver driver;
	@BeforeMethod
	public void Initialize() {
		WebActions action=new WebActions();
		driver=action.getDriver();
		action.launchURL(driver,"http://demo.guru99.com/test/newtours/index.php");
	}

	@Test
	public void testHeaderLinks() {
		MercuryHomePage mhpage=new MercuryHomePage(driver);
		WebActions actions=new WebActions();
		//WebDriver driver = actions.getDriver();
		actions.verifyElementExists(driver,mhpage.HeaderLinks_SignOn);
		actions.verifyElementExists(driver,mhpage.HeaderLinks_Register);
		actions.verifyElementExists(driver,mhpage.HeaderLinks_Support);
		actions.verifyElementExists(driver,mhpage.HeaderLinks_Contact);

	}
	
	@Test
	public void testNavigationBarLinks() {
		MercuryHomePage mhpage=new MercuryHomePage(driver);
		WebActions actions=new WebActions();
		//WebDriver driver = actions.getDriver();
		
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_Home);
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_Flights);
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_Hotels);
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_CarRentals);
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_Cruises);
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_Destinations);
		actions.verifyElementExists(driver,mhpage.navigationBarLinks_Vacations);


	}
	@AfterMethod
	public void finish()
	{
		driver.quit();
		
	}
}
