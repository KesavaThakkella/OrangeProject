package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {

	public static void capturescreenshot(WebDriver driver, String Screenshotname) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./Screenshots/" + Screenshotname + ".png"));
			System.out.println("Screenshot Taken");

		}

		catch (Exception e) {

			System.out.print("Exception while taking screenshot" + e.getMessage());
		}

	}
}