package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Orangewebsite.Pages.Swagpage;
import Variables.configProperties;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Swag {

	WebDriver driver;
	Swagpage sw;

	@Given("User is on log page")
	public void user_is_on_log_page() {

		System.setProperty("webdriver.chrome.driver", configProperties.property.getProperty("path"));
		driver = new ChromeDriver();
		// WebDriverManager.chromedriver().create();
		driver.manage().deleteAllCookies();
		driver.get(configProperties.property.getProperty("swagurl"));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String username, String password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sw = new Swagpage(driver);
		sw.swaguserpassword(username, password);

	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {

		sw.clickswaglogin();
		sw.swaglogodisplayed();
		sw.swagbackpackclick();
		sw.AddToCart();
		sw.CartIcon();
		sw.Checkout();

	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"in check out screen$")
	public void enter_and_and_in_check_out_screen(String Firstname, String Lastname, String Zipcode) throws Throwable {

		sw.CheckoutYourInformationPage();
		sw.FirstandLastname(Firstname, Lastname, Zipcode);
	}

}
