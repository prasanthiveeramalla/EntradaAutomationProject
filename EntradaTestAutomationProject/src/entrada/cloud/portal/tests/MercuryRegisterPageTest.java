package entrada.cloud.portal.tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.WebActions;
import entrada.cloud.portal.pages.MercuryHomePage;
import entrada.cloud.portal.pages.MercuryRegisterPage;

public class MercuryRegisterPageTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Initialize() {
		//WebActions action=new WebActions();
		driver=WebActions.getDriver();
		WebActions.launchURL(driver,"http://demo.guru99.com/test/newtours/index.php");
	}
	@Test
	public void testRegisterSuccess() {
		MercuryHomePage mhpage=new MercuryHomePage(driver); 
		mhpage.clickHPRegisterLink();
		MercuryRegisterPage mrpage=new MercuryRegisterPage(driver);
		boolean flag=mrpage.RegisterSuccess("aZFN", "aZLN", "98988888888", "adummy@yopmail.com", "Somajiguda", "Hyderabad", "Telengana", "500050", "INDIA", "azusername", "z1234*56", "z1234*56");
		common.Logger.assertEquals(flag+"", "true", "Verify registrations is successful", "");
	}
		
	@AfterMethod
	public void finish()
	{
		driver.quit();
		
	}
}