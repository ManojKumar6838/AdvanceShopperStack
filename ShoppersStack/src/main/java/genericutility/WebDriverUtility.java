package genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public String getPageTitle(WebDriver driver) {
		String title=driver.getTitle();
		return title;
	}
	
	public String getPageUrl(WebDriver driver) {
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public void selectDropdownByIndex(WebElement dropdown, int index) {
		Select sel=new Select(dropdown);
		sel.selectByIndex(index);
	}
	
	public String getTextFromWebelement(WebElement element) {
		String text=element.getText();
		return text;
	}
	
	public void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToAlertAndSendText(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public void dragAndDropElement(WebDriver driver, WebElement element1, WebElement element2) {
		Actions act=new Actions(driver);
		act.dragAndDrop(element1, element2).perform();
	}
	
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void doubleClickOnElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void switchToFrameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameByAttribute(WebDriver driver, String attributeName) {
		driver.switchTo().frame(attributeName);
	}
	
	public void switchToFrameByWebelement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public String getAttribute(WebElement element, String attributeName) {
		String value=element.getAttribute(attributeName);
		return value;
	}
	
	
}
