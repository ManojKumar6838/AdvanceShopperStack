package shopperstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[contains(@class,'MuiAvatar-')]")
	private WebElement profileLogo;

	public WebElement getProfileLogo() {
		return profileLogo;
	}
	
	@FindBy(xpath = "//ul[contains(@class,'MuiList-root MuiLis')]/li[7]")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

}
