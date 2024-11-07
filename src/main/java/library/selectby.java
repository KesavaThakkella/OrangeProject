package library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class selectby {

	public static void vertically(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// below will scroll vertically down
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void horizontally(WebDriver driver) {
		// To scroll horizantally side
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(-0,-1000)");

	}
}
