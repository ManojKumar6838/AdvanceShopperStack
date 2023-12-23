package shopperstack.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {
	@Test
	public void demoTest() {
		String browser=System.getProperty("browser");
		System.out.println(browser);
		Reporter.log("DemoTest Executing", true);
		
	}

}
