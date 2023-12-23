package shopperstack.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperties {

	public String getDataFromProperty(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/ShopperStack.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(key);
		return data;
		
	}
}
