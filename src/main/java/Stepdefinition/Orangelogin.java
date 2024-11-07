package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Variables.Objectproperties;
import Variables.configProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import library.Keyword;

public class Orangelogin {

	WebDriver driver;

	@Given("^user is on OrangeHRM page launchbrowser$")
	public void user_is_on_OrangeHRM_page_launchbrowser() {

		System.setProperty("webdriver.chrome.driver", configProperties.property.getProperty("path"));
		driver = new ChromeDriver();
		driver.get(configProperties.property.getProperty("orangesite"));
		driver.manage().window().maximize();

	}

	@Then("^Enter username in username text box \"([^\"]*)\"$")
	public void Enter_username_in_username_text_box(String identifier) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier)))
				.sendKeys(configProperties.property.getProperty("ouname"));

	}

	@Then("^password in password textbox\"([^\"]*)\"$")
	public void password_in_password_textbox(String identifier) {
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier)))
				.sendKeys(configProperties.property.getProperty("opass"));

	}

	@Then("^user clicks on Login button \"([^\"]*)\"$")
	public void user_clicks_on_Login_button(String identifier) {

		// driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();
		Keyword.clickbutton(Objectproperties.GetElementProperty(identifier));
		// Keyword.clickbutton("//button[@type='submit']");

	}

}
