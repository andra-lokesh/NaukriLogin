package stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.TestUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class stepLogin extends TestUtility{
	Login l = new Login();
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
l.ClickLogin();
		
	}
	@Then("^user enteres  user name$")
	public void user_enteres_user_name() throws Throwable {
	  l.EnterUserName();
	}

	@Then("^user enteres password$")
	public void user_entered_password() throws Throwable {
		l.EnterPassword();
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		l.UserSubmitedButton();
	}

	

	@Then("^Clear popup$")
	public void clear_popup() throws Throwable {
		 
	    
	}


	@When("^verify status of loggin functionality$")
	public void verify_status_of_loggin_functionality() throws Throwable {
	   l.UserIsonHomePage();
	}



}
