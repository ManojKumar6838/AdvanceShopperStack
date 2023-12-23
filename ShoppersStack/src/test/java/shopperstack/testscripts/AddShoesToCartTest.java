package shopperstack.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;

public class AddShoesToCartTest extends BaseClass{

	@Test
	public void addToCartTest() {
		Reporter.log("Shoes Added to Cart", true);
	}
}
