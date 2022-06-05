package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.TestUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepEditProfile extends TestUtility{
	@Given("^mouseHover on My Naukri$")
	public void mousehover_on_My_Naukri() throws Throwable {
		WebElement ele = driver.findElement(By.xpath("//a[@ href='https://my.naukri.com/HomePage/view']/div[2]"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
	}

	@Then("^Click on edit profile$")
	public void click_on_edit_profile() throws Throwable {
	   
	}
}
