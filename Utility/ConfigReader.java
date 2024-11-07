package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("F://code//Cucumber-FrameWork//Configuration//config.property");
			prop.load(fis);
		} catch (Exception e) {

			System.out.println("Exception is ==" + e.getMessage());

		}

	}

	public String getchromepath() {

		String path = prop.getProperty("chromedriverpath");
		return path;

	}

}
