package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Keyword {

	// Generic method or Reusable method / custom code to click on a button.
	public static WebDriver driver;

	public static void clickbutton(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	public static void clickingelement(WebElement element, String text) {

		element.click();
		element.clear();
		element.sendKeys(text);
	}

	// Generic method or Reusable method / custom code to handle the drop down.
	public static void selectdropdownvalue(String xpath, String valuetobeselected) {

		WebElement element = driver.findElement(By.xpath(xpath));
		List<WebElement> values = element.findElements(By.xpath(xpath));
		for (WebElement value : values) {
			System.out.println(value.getText());
			if (value.getText().equals(valuetobeselected)) {
				value.click();
				break;

			}

		}

	}

	public static void totaldropdownvaluescount(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		List<WebElement> values = element.findElements(By.xpath(xpath));
		System.out.println(values.size());

	}
}
