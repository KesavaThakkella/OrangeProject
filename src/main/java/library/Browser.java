package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Variables.configProperties;

public class Browser {

	public static WebDriver driver;

	public static void launch() {

		System.setProperty("webdriver.chrome.driver", configProperties.property.getProperty("path"));

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

	}

	public static void navigateTo(String url) {
		driver.get(configProperties.property.getProperty("nopurl"));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
	}

	public static void close() {
		driver.close();
	}

}
