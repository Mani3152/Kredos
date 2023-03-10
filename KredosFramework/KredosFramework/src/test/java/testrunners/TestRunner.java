package testrunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/RunModel.feature"},
		glue = {"stepdefinitions", "apphooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				"timeline:test-output/"
				},
		monochrome = true
		
		)


public class TestRunner {

}
