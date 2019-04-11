package restful.api.petstore.stepdefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/Features", glue = {"restful.api.petstore.initialsetup","restful.api.petstore.stepdefinitions" }, tags = { "@petstore" }, plugin = { "pretty", "html:target/cucumber",
				"json:target/cucumber/cucumber.json"}, monochrome = true)

public class RunnerTest extends AbstractTestNGCucumberTests {
}


