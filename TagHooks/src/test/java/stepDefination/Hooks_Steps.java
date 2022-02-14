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
	@Before
	public void beforescenario() {
		System.out.println("This will run before the scenario");
	}
	@After
public void afterScenario() {
	System.out.println("This will run After the scenario");
	}

	@Before("@First")
	public void beforeFirst() {
		System.out.println("This will run before the scenario1");
	}
	@Before("@Second")
	public void beforesecond() {
		System.out.println("This will run before the scenario2");
	}
	@Before("@Third")
	public void beforeThird() {
		System.out.println("This will run before the scenario3");
	}
	
	@After("@First")
	public void AfterFirst() {
		System.out.println("This will run before the scenario1");
	}
	@Before("@Second")
	public void Aftersecond() {
		System.out.println("This will run before the scenario2");
	}
	@Before("@Third")
	public void AfterThird() {
		System.out.println("This will run before the scenario3");
	}

}
