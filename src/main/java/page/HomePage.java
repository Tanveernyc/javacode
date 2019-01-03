package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver Idriver) {
		this.driver=Idriver;
	}
	
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'CRM')]")
	WebElement CRM;
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Add Contact')]")
	WebElement AddContact;
	@FindBy(how=How.NAME, using="name")
	WebElement SearchCustomer;
	
	
	public void NavigatingToAddContact() {
		
		CRM.click();
		AddContact.click();	
	}
	
	public void VerifyPageLogin() {
		
		CRM.isDisplayed();
		SearchCustomer.isDisplayed();
	}
	
	

}
