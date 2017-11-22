package StepFiles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class filesteps {
	
	@Given("^there are (\\d+) coffees left in the machine$")
	public void there_are_coffees_left_in_the_machine(int arg1) throws Throwable {
	   System.out.println("one");
	}

	@Given("^I have deposited (\\d+)\\$$")
	public void i_have_deposited_$(int arg1) throws Throwable {
		 System.out.println("two");
	}

	@When("^I press the coffee button$")
	public void i_press_the_coffee_button() throws Throwable {
		 System.out.println("three");
	}

	@Then("^I should be served a coffee$")
	public void i_should_be_served_a_coffee() throws Throwable {
		 System.out.println("four");
	}

}
