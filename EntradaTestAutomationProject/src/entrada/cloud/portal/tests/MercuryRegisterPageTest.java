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
		WebActions action=new WebActions();
		driver=action.getDriver();
		action.launchURL(driver,"http://demo.guru99.com/test/newtours/index.php");
	}
	@Test
	public void testRegisterSuccess() {
		MercuryHomePage mhpage=new MercuryHomePage(driver); 
		mhpage.clickHPRegisterLink();
		MercuryRegisterPage mrpage=new MercuryRegisterPage(driver);
		boolean flag=mrpage.EnterRegisterDetails("ZFN", "ZLN", "98988888888", "dummy@yopmail.com", "Somajiguda", "Hyderabad", "Telengana", "500050", "INDIA", "zusername", "z1234*56", "z1234*56");
		common.Logger.assertEquals(flag+"", "true", "Verify registrations is successful", "");
	}
		
	@AfterMethod
	public void finish()
	{
		driver.quit();
		
	}
}