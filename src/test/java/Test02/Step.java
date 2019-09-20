package Test02;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

	@Given("Enter the {string}")
	public void enter_the1(String string) {
	    System.out.println(string);
	  
	}
	
	@And("Enter the {string} in the field")
	public void enter_the_in_the_field(String string) {
	    System.out.println(string);
	  
	}

	@When("click on login")
	public void click_on_login() {
		
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    
	}


}
