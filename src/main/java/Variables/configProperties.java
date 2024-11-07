package Variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configProperties {

	public static Properties property;
	private static String configpath = "Configuration/configsetting.properties";

	public static void initializePropertyFile() {

		property = new Properties();
		try {
			FileInputStream fis = new FileInputStream(configpath);
			property.load(fis);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
