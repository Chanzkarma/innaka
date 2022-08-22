package demoCucumber;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(d, this);
	}

	@FindBy(id = "name")
	private List<WebElement> name;
	@FindBy(id = "password")
	private List<WebElement> password;
	@FindBy(id = "country")
	private List<WebElement> country;
	@FindBy(id = "address")
	private List<WebElement> address;
	@FindBy(id = "email")
	private List<WebElement> email;
	@FindBy(id = "phone")
	private List<WebElement> phone;

	public List<WebElement> getName() {
		return name;
	}

	public void setName(List<WebElement> name) {
		this.name = name;
	}

	public List<WebElement> getPassword() {
		return password;
	}

	public void setPassword(List<WebElement> password) {
		this.password = password;
	}

	public List<WebElement> getCountry() {
		return country;
	}

	public void setCountry(List<WebElement> country) {
		this.country = country;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public void setAddress(List<WebElement> address) {
		this.address = address;
	}

	public List<WebElement> getEmail() {
		return email;
	}

	public void setEmail(List<WebElement> email) {
		this.email = email;
	}

	public List<WebElement> getPhone() {
		return phone;
	}

	public void setPhone(List<WebElement> phone) {
		this.phone = phone;
	}

}
