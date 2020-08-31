package entrada.cloud.portal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.WebActions;

public class MercuryLoginPage {
	public  WebDriver driver;

	public static   String url="http://demo.guru99.com/test/newtours/index.php";

	public   By lp_username = By.name("userName");
	public   By lp_password = By.name("password");
	public  By lp_submit = By.name("submit");

	public MercuryLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setLoginUsername(String un) {
		WebActions.EnterValue(driver, lp_username, un);
		
	}
	public void setLoginPassword(String pwd) {
		WebActions.EnterValue(driver, lp_password, pwd);
	}
	
	public void getSuccessLogin() {
		
		
	}
	
}
