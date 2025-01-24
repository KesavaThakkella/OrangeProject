package Orangewebsite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mercurypage {

	WebDriver driver;

	By customerlogin = By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a/text()");
	By Internationalholiday = By.xpath("//a[contains(text(),'International Holidays')]");

	public Mercurypage(WebDriver driver) {

		this.driver = driver;
	}

	public void customerlogin() {

		driver.findElement(customerlogin).click();
	}

	public void Ih() {

		driver.findElement(Internationalholiday).click();

	}
}
