package testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\CucumberProject\\CucumberProject_005_DataTable_withMap\\src\\test\\java\\Features\\login.feature",
		plugin = {"pretty","html:target/cucumber-reports",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"},
		glue= {"stepDefination"}
		
		)


public class testrunner 
{


}
