package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {

	WebDriver driver;

	public AddContactPage(WebDriver Idriver) {
		this.driver = Idriver;
	}

	@FindBy(how = How.ID, using = "account")
	WebElement FullName;

	@FindBy(how = How.ID, using = "company")
	WebElement CompanyName;

	@FindBy(how = How.ID, using = "email")
	WebElement Email;

	@FindBy(how = How.ID, using = "phone")
	WebElement Phone;

	@FindBy(how = How.ID, using = "address")
	WebElement Address;

	@FindBy(how = How.ID, using = "city")
	WebElement City;

	@FindBy(how = How.ID, using = "state")
	WebElement State;

	@FindBy(how = How.ID, using = "zip")
	WebElement ZIP;

	@FindBy(how = How.ID, using = "select2-country-container")
	WebElement Country;
	@FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
	WebElement CountryTextBox;

	@FindBy(how = How.ID, using = "submit")
	WebElement Button;

	public void FillingUpFrom(String Name,String Company,String email,String phone,String address,String city,String state,String zip,String country) {

		FullName.sendKeys(Name);
		CompanyName.sendKeys(Company);
		Email.sendKeys(email);
		Phone.sendKeys(phone);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZIP.sendKeys(zip);

		Country.click();
		CountryTextBox.sendKeys(country);
		CountryTextBox.sendKeys(Keys.ENTER);

		Button.click();

	}
}
