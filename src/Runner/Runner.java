package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class) 
@CucumberOptions(plugin = {"pretty","junit:reports/cucumber.xml"},features = "src/Features",glue="StepFiles")

public class Runner {
	//junit:Folder_Name/cucumber.xml
	//json:reports/cucumber.json
}
