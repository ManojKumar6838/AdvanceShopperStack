package shoppersstack.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.LogStatus;

import listnerimplementation.ListnerImp;
import shopperstack.fileutility.ReadProperties;
import shopperstack.objectrepository.HomePage;
import shopperstack.objectrepository.LoginPage;
import shopperstack.objectrepository.WelcomePage;


public class BaseClass extends ListnerImp{

	public WebDriver driver;
	public static WebDriver sdriver;
	
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		driver=new ChromeDriver();
//		if(browser.equalsIgnoreCase("chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge")) {
//			driver=new EdgeDriver();
//		}
//		else {
//			driver=new ChromeDriver();
//		}
		sdriver=driver;
		driver.manage().window().maximize();
		Reporter.log("Browser Lounched Successfully", true);
		//test.log(LogStatus.INFO, "Browser launched successfully and navigated to Application");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws Throwable {
		ReadProperties properties=new ReadProperties();
		String url=properties.getDataFromProperty("url");
		String username=properties.getDataFromProperty("username");
		String password=properties.getDataFromProperty("password");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WelcomePage welcome=new WelcomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(welcome.getLoginButton()));
		welcome.getLoginButton().click();
		LoginPage login=new LoginPage(driver);
		login.getEmailTextField().sendKeys(username);
		login.getPasswordTextField().sendKeys(password);
		login.getLoginButton().click();
		wait.until(ExpectedConditions.titleContains("Home"));
		Reporter.log("Logged in Successfully", true);
		//test.log(LogStatus.INFO, "Logged in Successfully");
		
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser closed Successfully", true);
		//test.log(LogStatus.INFO, "Browser Closed Successfully");
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		HomePage home=new HomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(home.getProfileLogo()));
		home.getProfileLogo().click();
		home.getLogoutButton().click();
		Reporter.log("Logged out Successfully", true);
		//test.log(LogStatus.INFO, "Logged Out Successfully");
	}
	
}
