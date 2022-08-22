package CucumberDrill;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDef {
	WebDriver d;

	@Given("Thebrowser should open")
	public void thebrowser_should_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikramt\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		

	}

	@Given("Enter the URL")
	public void enter_the_URL() {
		d.get("https://example.testproject.io/web/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		

	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {

	    d.findElement(By.id("name")).sendKeys("Ted");
	    d.findElement(By.id("password")).sendKeys("12345");
	}

	@When("Click the Login button")
	public void click_the_Login_button() {
		
		d.findElement(By.id("login")).click();
	}

	@When("Enter the country")
	public void enter_the_country() {

		
		d.findElement(By.id("country")).click();
		d.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("ind");
		d.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys(Keys.ENTER);

	}

	@When("Enter the Address")
	public void enter_the_Address() {
		

		d.findElement(By.id("address")).sendKeys("123, Main street");
	}

	@When("Enter the Email")
	public void enter_the_Email() {
		

		d.findElement(By.id("email")).sendKeys("Test123@gmail.com");
	}

	@When("Enter the Phone Number")
	public void enter_the_Phone_Number() {
		

		d.findElement(By.id("phone")).sendKeys("8767898765");
	}

	@When("Click the save button")
	public void click_the_save_button() {
		

		d.findElement(By.id("save")).click();
	}

	@Then("Click the logout button")
	public void click_the_logout_button() {
		

		d.findElement(By.id("logout")).click();
	}

}
