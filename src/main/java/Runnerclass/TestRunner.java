package Runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Variables.Objectproperties;
import Variables.configProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\OneDrive\\Documents\\Automation Setup\\OrangeProject\\src\\main\\java\\Features\\swag.feature", glue = {
		"Stepdefinition" }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {
//C:\\Users\\user\\eclipse-workspace\\Orange\\src\\main\\java\\Features\\Login.feature
	// Plugin = {"html:target/Cucumber-html-report"}
	// Plugin = {
	// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	// "return:target/failed.txt"
	// },

	@BeforeClass
	public static void beforeclass() {

		configProperties.initializePropertyFile();
		Objectproperties.initializeObjectProperties();
	}

	@AfterClass
	public static void afterclass() {

	}
}
