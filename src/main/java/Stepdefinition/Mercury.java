package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Orangewebsite.Pages.Mercurypage;
import Variables.Objectproperties;
import Variables.configProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import library.Data;
import library.calendar;
import library.utility;

public class Mercury {

	WebDriver driver;
	Mercurypage m;

	@Given("^user is on title page launchbrowser$")
	public void user_is_on_titile_page_launch_browser() {

		System.setProperty("webdriver.chrome.driver", configProperties.property.getProperty("path"));
		driver = new ChromeDriver();
		driver.get(configProperties.property.getProperty("url"));
		driver.manage().window().maximize();

	}

	@Then("^Select destination from \"([^\"]*)\"$")
	public void Enter_destination(String identifier) throws Exception {

		m = new Mercurypage(driver);
		m.Ih();
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier)))
				.sendKeys(configProperties.property.getProperty("destinationcity"));

		System.out.println("Destination is !...Hyderabad...!");

	}

	@Then("^Select duration from \"([^\"]*)\"$")
	public void Select_duration_from_dropdown(String identifier) {

		try {
			Select duration = new Select(driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))));
			duration.selectByVisibleText(configProperties.property.getProperty("durationfrom"));
			/*
			 * duration.selectByValue("4Nights / 5Days"); duration.selectByIndex(1);
			 * 
			 * //span[@class='white-text'] //a[contains(text(),'No, thanks')]
			 */
			System.out.println("7Nights+8Days");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Then("^Select start date from \"([^\"]*)\"$")
	public void Select_start_date_from_dropdown(String identifier) {

		WebElement date = driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier)));
		String dateval = "08/04/2019";
		calendar.selectdatebyjs(driver, date, dateval);
		utility.capturescreenshot(driver, "selected date");

	}

	@Then("^select type of holiday from \"([^\"]*)\"$")
	public void select_type_of_holiday_from_dropdown(String identifier) {

		try {
			Select type_holiday = new Select(
					driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))));
			type_holiday.selectByVisibleText(configProperties.property.getProperty("Typeofholiday"));
			System.out.println("Type of holiday is Island");
			System.out.println(Data.monthmap().get(5));
		} catch (Exception e) {

			System.out.println(e);
		}
	}

	@Then("^click on search icon \"([^\"]*)\"$")
	public void click_on_search_holidays_icon(String identifier) {

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(Objectproperties.GetElementProperty(identifier))).click();
		utility.capturescreenshot(driver, "final screen");

	}

}
