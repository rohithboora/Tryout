package ham;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver ;
	Home h = new Home();
	
	@Given("^User is on Tesco Direct Home Page$")
	public void user_is_on_Tesco_Direct_Home_Page() throws Throwable {
	   // h.just();
		h.findElement(driver);
	}

	@When("^User tries to login with Username \"(.*?)\" and Password \"(.*?)\"$")
	public void user_tries_to_login_with_Username_and_Password(String arg1, String arg2) throws Throwable {
	    
	}

	@Then("^User can see the profile page with sign out option$")
	public void user_can_see_the_profile_page_with_sign_out_option() throws Throwable {
	   
	}
}
