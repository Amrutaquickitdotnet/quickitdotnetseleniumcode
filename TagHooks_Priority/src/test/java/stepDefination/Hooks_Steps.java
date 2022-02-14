package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_Steps {
	
	@Given("this is the first step")
	public void this_is_the_first_step() {
		System.out.println("This is First Step");
	   
	}
	@When("this is the second step")
	public void this_is_the_second_step() {
		System.out.println("This is Second Step");
	}
	@Then("this is the third step")
	public void this_is_the_third_step() {
		System.out.println("This is third Step");
	    
	}
	@Before(order=1)
	public void beforescenario() {
		System.out.println("This will run before the scenario");
	}
	
	@Before(order=0)
	public void beforescenariostart() {
		System.out.println("This will run before the scenariostart");
	}
	@After(order=1)
public void afterScenario() {
	System.out.println("This will run After the scenario");
	}
	@After(order=0)
	public void afterScenarioEnd() {
		System.out.println("This will run After the scenarioEnd");
		}
	

}
