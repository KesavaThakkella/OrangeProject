package Orangewebsite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Variables.configProperties;

public class Swagpage {

	WebDriver driver;
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");
	By SauceLabsBackpack = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	By AddToCart = By.xpath("(//button[contains(text(),'ADD TO CART')])[1]");
	By CartIcon = By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");
	By Checkout = By.xpath("//a[contains(text(),'CHECKOUT')]");
	By CheckoutYourInformationPage = By.xpath("//div[contains(text(),'Checkout: Your Information')]");
	By txt_Firstname = By.id("first-name");
	By txt_Lastname = By.id("last-name");
	By txt_postalcode = By.id("postal-code");

	public Swagpage(WebDriver driver) {

		this.driver = driver;
	}

	public void enterusername(String username) {

		driver.findElement(txt_username).sendKeys(configProperties.property.getProperty("swagusername"));
	}

	public void enterpassword(String password) {

		driver.findElement(txt_password).sendKeys(configProperties.property.getProperty("swagpassword"));
	}

	public void swaguserpassword(String username, String password) {

		driver.findElement(txt_username).sendKeys(configProperties.property.getProperty("swagusername"));
		driver.findElement(txt_password).sendKeys(configProperties.property.getProperty("swagpassword"));

	}

	public void clickswaglogin() {

		driver.findElement(btn_login).click();
	}

	public void swaglogodisplayed() {

		driver.findElement(lbl_logo).isDisplayed();

	}

	public void swagbackpackclick() {

		driver.findElement(SauceLabsBackpack).click();

	}

	public void AddToCart() {

		driver.findElement(AddToCart).click();
		System.out.println("Item Added To Cart");

	}

	public void CartIcon() {

		driver.findElement(CartIcon).click();
	}

	public void Checkout() {

		driver.findElement(Checkout).click();
	}

	public void CheckoutYourInformationPage() {

		driver.findElement(CheckoutYourInformationPage).isDisplayed();
		System.out.println("Checkout: Your Information page displayed");
	}

	public void FirstandLastname(String Firstname, String Lastname, String Zipcode) {

		driver.findElement(txt_Firstname).sendKeys(configProperties.property.getProperty("swagfirstname"));
		driver.findElement(txt_Lastname).sendKeys(configProperties.property.getProperty("swaglastname"));
		driver.findElement(txt_postalcode).sendKeys(configProperties.property.getProperty("Zipcode"));

	}
}
