package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseClass;

public class IndexPage_SD extends BaseClass{
	
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		BaseClass.initialization();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		
	}

}
