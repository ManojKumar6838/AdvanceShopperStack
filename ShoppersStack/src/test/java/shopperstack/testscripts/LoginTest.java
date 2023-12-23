package shopperstack.testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;
import shopperstack.fileutility.ReadProperties;
import shopperstack.objectrepository.LoginPage;
import shopperstack.objectrepository.WelcomePage;

public class LoginTest extends BaseClass{

	@Test
	public void loginTest() throws Throwable {
//		ReadProperties properties=new ReadProperties();
//		String username=properties.getDataFromProperty("username");
//		String password=properties.getDataFromProperty("password");
//		
//		WelcomePage welcome=new WelcomePage(driver);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(welcome.getLoginButton()));
//		//Thread.sleep(5000);
//		welcome.getLoginButton().click();
//		
//		LoginPage login=new LoginPage(driver);
//		login.getEmailTextField().sendKeys(username);
//		login.getPasswordTextField().sendKeys(password);
//		login.getLoginButton().click();
		
		Reporter.log("Login Test Executing", true);
	}
}
