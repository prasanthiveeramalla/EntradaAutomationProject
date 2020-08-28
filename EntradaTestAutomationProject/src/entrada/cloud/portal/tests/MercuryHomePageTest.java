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
		//WebActions action=new WebActions();
		driver=WebActions.getDriver();
		WebActions.launchURL(driver,"http://demo.guru99.com/test/newtours/index.php");
	}

	@Test
	public void testHeaderLinks() {
		MercuryHomePage mhpage=new MercuryHomePage(driver);
		//WebActions actions=new WebActions();
		//WebDriver driver = actions.getDriver();
		WebActions.verifyElementExists(driver,mhpage.HeaderLinks_SignOn);
		WebActions.verifyElementExists(driver,mhpage.HeaderLinks_Register);
		WebActions.verifyElementExists(driver,mhpage.HeaderLinks_Support);
		WebActions.verifyElementExists(driver,mhpage.HeaderLinks_Contact);

	}
	
	@Test
	public void testNavigationBarLinks() {
		MercuryHomePage mhpage=new MercuryHomePage(driver);
	//	WebActions actions=new WebActions();
		//WebDriver driver = actions.getDriver();
		
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_Home);
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_Flights);
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_Hotels);
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_CarRentals);
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_Cruises);
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_Destinations);
		WebActions.verifyElementExists(driver,mhpage.navigationBarLinks_Vacations);


	}
	@AfterMethod
	public void finish()
	{
		driver.quit();
		
	}
}
