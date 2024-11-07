package Variables;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Objectrepository {

	public By bylocator;

	public void BuildLocator(String objectName) {

		try {
			String pagename = objectName.split("\\.")[0];
			String locatorname = objectName.split("\\.")[1];

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("Objectrepository\\\\Objects.xml"));
			doc.getDocumentElement().normalize();
			NodeList nlist = doc.getElementsByTagName(pagename);
			Element element = (Element) nlist.item(0);

			String locatorvalue = ((Element) element.getElementsByTagName(locatorname).item(0))
					.getElementsByTagName("LocatorValue").item(0).getTextContent();
			String locatortype = ((Element) element.getElementsByTagName(locatorname).item(0))
					.getElementsByTagName("LocatorType").item(0).getTextContent();

			bylocator = GetLocator(locatortype, locatorvalue);
		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public By GetLocator(String locatortype, String locatorvalue) {

		switch (locatortype.toLowerCase()) {

		case "id":
			return By.id(locatorvalue);

		case "name":
			return By.name(locatorvalue);
		case "xpath":
			return By.xpath(locatorvalue);
		case "linktext":
			return By.linkText(locatorvalue);

		default:
			return null;

		}

	}
}
