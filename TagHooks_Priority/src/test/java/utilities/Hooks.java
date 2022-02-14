package utilities;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\CucumberProject\\TagHooks_Priority\\src\\test\\java\\Feature\\Test.feature",
		glue = {"stepDefination"}
		)
public class Hooks {

	
}
