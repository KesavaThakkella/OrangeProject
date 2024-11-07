package Variables;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Objectproperties {

	static Map<?, ?> property;
	static String objectfilepath = "Objectrepository/Objects.yml";

	public static void initializeObjectProperties() {

		try {
			FileReader rd = new FileReader(objectfilepath);
			Yaml yml = new Yaml();
			property = (Map<?, ?>) yml.load(rd);
			rd.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String GetElementProperty(String objectstring) {

		Map<?, ?> map = (Map<?, ?>) property.get(objectstring.split("\\.")[0]);
		return map.get(objectstring.split("\\.")[1]).toString();
	}
}
