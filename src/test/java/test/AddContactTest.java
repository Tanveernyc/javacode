package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;
import util.Xls_Reader;

public class AddContactTest {
	
	Xls_Reader reader = new Xls_Reader("/Users/riyad/eclipse-workspace/xlsxFile/Data/TestData.xlsx");
	String Email = reader.GetCellData("sheet1", "Email", 2);
	String Password = reader.GetCellData("sheet1", "Password", 2);
	String FullName = reader.GetCellData("sheet1", "Name", 2);
	String Company = reader.GetCellData("sheet1", "Company", 2);
	String Emailcontact = reader.GetCellData("sheet1", "Emailcontact", 2);
	String Phone = reader.GetCellData("sheet1", "Phone", 2);
	String Adsress = reader.GetCellData("sheet1", "Adsress", 2);
	String City = reader.GetCellData("sheet1", "City", 2);
	String State = reader.GetCellData("sheet1", "State", 2);
	String Zipzode = reader.GetCellData("sheet1", "Zipzode", 2);
	String Country = reader.GetCellData("sheet1", "Country", 2);
	
	
	@Test
	public void AddContact() {
		WebDriver driver = BrowserFactory.StartBrowser("Chrome", "http://techfios.com/test/billing/?ng=login/");
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login(Email, Password);
		
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		Home.NavigatingToAddContact();
		Home.VerifyPageLogin();
		
		AddContactPage Addinfo = PageFactory.initElements(driver, AddContactPage.class);
		Addinfo.FillingUpFrom(FullName, Company, Emailcontact, Phone, Adsress, City, State, Zipzode, Country);
		
		driver.close();
		driver.quit();
		
	}

}
