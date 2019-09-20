package Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

@Given("Enter {string} and {string}")
public void credentials(String x,String y) {
    System.out.println(x+"  "+y);

}

@When("click on login")
public void click_on_login() {
	System.out.println("Login button is clicked");
}

@Then("Home page is displayed")
public void home_page_is_displayed() {
	System.out.println("Home Page is displayed");
}

@Given("Enter Credentials")
public void enter_Credentials() {
	System.out.println("Credentials entered");
}

@Then("Home page is not displayed")
public void home_page_is_not_displayed() {
	System.out.println("Home Page is not displayed");
}


}
