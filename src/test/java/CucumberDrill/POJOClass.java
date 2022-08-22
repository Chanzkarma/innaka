package CucumberDrill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class POJOClass {

	@FindBy(id = "name")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;

	@FindBy(id = "country")
	WebElement txt_country;

	@FindBy(id = "address")
	WebElement txt_address;

	@FindBy(id = "email")
	WebElement txt_email;

	@FindBy(id = "phone")
	WebElement txt_phone;

	@FindBy(id = "save")
	WebElement btn_save;

	@FindBy(id = "logout")
	WebElement btn_logout;

	WebDriver d;

	public POJOClass(WebDriver d) {
		this.d = d;

		PageFactory.initElements(new AjaxElementLocatorFactory(d, 30), this);
	}
	
	public void enterUserName(String Ted) {
		txt_username.sendKeys(Ted);
	}
	
	public  void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public  void enterLogin() {
		btn_login.click();
	}
	
	public  void enterCountry(String in) {
		txt_country.sendKeys(in);
	}
	
	public  void enterAddress(String address) {
		txt_address.sendKeys(address);
	}
	
	
	public  void enterEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public  void enterPhone(String phone) {
		txt_phone.sendKeys(phone);
	}
	
	public  void enterSave() {
		btn_save.click();
	}
	
	public  void enterLogout() {
		btn_logout.click();
	}
	

}
