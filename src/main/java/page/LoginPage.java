package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver Idriver) {
		this.driver=Idriver;
	}
	
	
	@FindBy(how=How.ID, using="username")
	WebElement UserName;
	@FindBy(how=How.ID, using="password")
	WebElement PassWord;
	@FindBy(how=How.NAME, using="login")
	WebElement SigninButton;
	
	
	public void login(String Email, String Pasword) {
		UserName.sendKeys(Email);
		PassWord.sendKeys(Pasword);
		SigninButton.click();
		
	}
	

}
