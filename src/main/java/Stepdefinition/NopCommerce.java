package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Variables.Objectproperties;
import Variables.configProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.Keyword;

public class NopCommerce {

	WebDriver driver;

	@Given("^if user is on admin area demo page launch browser$")
	public void if_user_is_on_admin_area_demo_page_launch_browser() {

		System.setProperty("webdriver.chrome.driver", configProperties.property.getProperty("path"));
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(configProperties.property.getProperty("nopurl"));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

		// Browser.launch();
		// Browser.navigateTo(configProperties.property.getProperty("nopurl"));

		// WebDriver driver = WebDriverManager.chromedriver().create();
		// driver.get(configProperties.property.getProperty("nopurl"));

	}

	@When("^Enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void Enter_email_and_password(String identifier, String identifier1) {

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).clear();
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier1))).clear();

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier)))
				.sendKeys(configProperties.property.getProperty("nopemail"));
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier1)))
				.sendKeys(configProperties.property.getProperty("noppass"));

	}

	@Then("^Click on login button \"([^\"]*)\"$")
	public void Click_on_login_button(String identifier) throws Exception {

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();
		Thread.sleep(4000);
	}

	@Then("^Click on sales \"([^\"]*)\" and orders \"([^\"]*)\"$")
	public void Click_on_sales_and_orders(String identifier, String identifier1) throws Exception {

		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier1))).click();

	}

	@Then("^Get the order numbers from orders table$")
	public void Get_the_order_numbers_from_orders_table() throws Exception {

		System.out.println("Order#");
		// *[@id="orders-grid"]/tbody/tr[1]/td[2]

		Thread.sleep(4000);
		String beforexpath = Objectproperties.GetElementProperty("Orders_Homepage.before");
		String afterxpath = Objectproperties.GetElementProperty("Orders_Homepage.after");

		for (int i = 1; i <= 5; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if (element.getText().contains(configProperties.property.getProperty("value"))) {
				driver.findElement(By.xpath(Objectproperties.GetElementProperty("Orders_Homepage.Fifthcheckbox")))
						.click();

				element.getText().equals(configProperties.property.getProperty("Customername"));
				Keyword.clickbutton(Objectproperties.GetElementProperty("Orders_Homepage.Viewbutton"));
			}

			// driver.findElement(By.xpath("(//a[@class='btn btn-default'])[1]")).click();

		}

	}

}
