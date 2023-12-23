package listnerimplementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericutility.JavaUtility;
import shoppersstack.baseclass.BaseClass;

public class ListnerImp implements ITestListener, ISuiteListener{

	public static ExtentReports report;
	public static ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		Reporter.log(suite.getName()+" Has Started", true);
		JavaUtility javaUtility=new JavaUtility();
		String time = javaUtility.getDateAndTime();
		report=new ExtentReports("./AdvancedReports/"+suite.getName()+time+".html");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Test Has Started", true);
		test=report.startTest(result.getName());
		test.log(LogStatus.INFO, "Test has been Started");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		 String imgPath="./FailedScreenshots/"+result.getName()+".png";
		 TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
		 File ss = ts.getScreenshotAs(OutputType.FILE);
		 File path=new File(imgPath);
		 try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, "Test is Failed");
		test.log(LogStatus.INFO, test.addScreenCapture("."+imgPath));
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" Test Has Skipped", true);
		test.log(LogStatus.SKIP, "Test is Skipped");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" is Successfully Executed", true);
		test.log(LogStatus.PASS, "Test is Passed");
	}
	
	@Override
	public void onFinish(ISuite suite) {
		Reporter.log(suite.getName()+" Has Finished", true);
		report.endTest(test);
		report.flush();
	}
}
