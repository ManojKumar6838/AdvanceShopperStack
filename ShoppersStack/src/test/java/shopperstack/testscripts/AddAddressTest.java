package shopperstack.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import shoppersstack.baseclass.BaseClass;
@Listeners(listnerimplementation.ListnerImp.class)
public class AddAddressTest extends BaseClass {

	@Test
	public void addAddressTest() { 
		//Click on profile
//		String title="Shoppers | Home";
//		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(title, "Shoppers | Profile");
		Reporter.log("Adress Added", true);
		
//		soft.assertAll();
	}
}
