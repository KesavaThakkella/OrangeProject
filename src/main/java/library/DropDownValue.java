package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownValue {
	public static WebDriver driver;

	public static void main(String[] args) {

		selectDropdownvalue(null, DropDown.INDEX.toString(), null);
		selectDropdownvalue(null, DropDown.VISIBLETEXT.toString(), null);
		selectDropdownvalue(null, DropDown.VALUE.toString(), null);

		
	}

	public static void selectDropdownvalue(By locator, String type, String value) {

		Select select = new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));

			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;

		default:

			System.out.println("Please pass correct selection criteria");
			break;
		}

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doselectByvisibleText(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public static void doselectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public static void doselectByValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

}
