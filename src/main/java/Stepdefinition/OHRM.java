package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Variables.Objectproperties;
import Variables.configProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRM {

	public static WebDriver driver;

	@Given("^user is on Admin OrangeHRM page launch browser$")
	public void user_is_on_Admin_OrangeHRM_page_launch_browser() {

		// System.setProperty("webdriver.chrome.driver",
		// configProperties.property.getProperty("path"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(configProperties.property.getProperty("OsiteUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^Enter User name \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void Enter_User_name_and_Password(String identifier, String identifier1) {

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier)))
				.sendKeys(configProperties.property.getProperty("orangename"));
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier1)))
				.sendKeys(configProperties.property.getProperty("orangepass"));

	}

	@Then("^user clicks on Login \"([^\"]*)\"$")
	public void user_clicks_on_Login(String identifier) {

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();

	}

	@Then("^Recruiter clicks on Recruitment menu \"([^\"]*)\"$")
	public void Recruiter_clicks_on_Recruitment_menu(String identifier) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();

	}

	@Then("^user clicks on userdropdown menu \"([^\"]*)\"$")
	public void user_clicks_on_userdropdown_menu(String identifier) {

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();
		driver.findElement(By.xpath(Objectproperties.GetElementProperty("logout"))).click();
	}

}
