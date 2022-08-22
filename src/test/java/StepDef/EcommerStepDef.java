package StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EcommerStepDef {
	WebDriver d;

	@Given("The browser should open")
	public void the_browser_should_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikramt\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(" https://askomdch.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.manage().window().maximize();
		

	}

	@Given("Should click the om shop now")
	public void should_click_the_om_shop_now() {
		
		d.findElement(By.className("wp-block-button__link")).click();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}

	@When("search for a product")
	public void search_for_a_product() {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Jeans");
		
	}

	@Then("Should click the search button")
	public void should_click_the_search_button() {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		d.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();
		
//		d.quit();
	}

}
