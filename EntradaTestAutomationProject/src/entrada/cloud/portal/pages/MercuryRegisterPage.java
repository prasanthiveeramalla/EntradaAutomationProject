package entrada.cloud.portal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.WebActions;


public class MercuryRegisterPage {
	public   By register_FirstName = By.name("firstName");
	public   By register_LastName = By.name("lastName");
	public   By register_Phone = By.name("phone");
	public   By register_Email = By.name("userName");
	public   By register_Address = By.name("address1");
	public   By register_City = By.name("city");
	public   By register_State = By.name("state");
	public   By register_postalcode = By.name("postalCode");
	public   By register_Country = By.name("country");
	public   By register_UserName = By.name("email");
	public   By register_Password = By.name("password");
	public   By register_ConfirmPassword = By.name("confirmPassword");
	public   By register_Submit = By.name("submit");

	public   By register_mailSuccess=By.xpath("//font[contains(text(),'Thank you for registering.')]");
	private WebDriver driver;


	public MercuryRegisterPage(WebDriver driver) {
		this.driver=driver;
	}


	/*public By getMailContent=By.xpath("//table//td[2]//table//tr[4]//table//tr[3]");
	public String RP_UserNameVal="Note: Your user name is";
	public By fieldSuccessNotePart1=By.xpath("//b[contains(text(),'Note: Your user name is')]");
	public By fieldSuccessNotePart2=By.xpath("//b[contains(text(),'lbnagar");
	 */
	public boolean EnterRegisterDetails(String FN, String LN, String phone, String email, String address, String city, String state, String postalCode, String country, String username, String pwd, String confmPwd) {

		WebActions actions=new WebActions();
		actions.EnterValue(driver, register_FirstName, FN);
		actions.EnterValue(driver, register_LastName, LN);
		actions.EnterValue(driver, register_Phone, phone);
		actions.EnterValue(driver, register_Email, email);
		actions.EnterValue(driver, register_Address, address);
		actions.EnterValue(driver, register_City, city);
		actions.EnterValue(driver, register_State, state);
		actions.EnterValue(driver, register_postalcode, postalCode);
		actions.gf_SelectbyValue(driver, register_Country, country);
		actions.EnterValue(driver, register_UserName, username);
		actions.EnterValue(driver, register_Password, pwd);
		actions.EnterValue(driver, register_ConfirmPassword, confmPwd);
		actions.clickOnElement(driver, register_Submit);
				
		return actions.verifyElementExists(driver, register_mailSuccess);
		//actions.verifyElementExists(driver, fieldSuccessNotePart1);


	}


}
