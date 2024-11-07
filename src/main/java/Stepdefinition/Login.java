package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	@Given("^if user is on OrangeHRM page$")
	public void if_user_is_on_OrangeHRM_page() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/webdrivermanager/");
	}

}
