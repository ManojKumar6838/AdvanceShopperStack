package shopperstack.testscripts;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericutility.WebDriverUtility;
import shoppersstack.baseclass.BaseClass;

@Listeners(listnerimplementation.ListnerImp.class)
public class DemoTest{

	@Test
	public void demoTest() {
		String browser=System.getProperty("browser");
		System.out.println(browser);
		Reporter.log("DemoTest Executing", true);
		
	}
	
	
}
