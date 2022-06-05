package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Utility.TestUtil;
import core.TestUtility;
import junit.framework.Assert;

public class Login extends TestUtil{
	private By PrimaryLoginBtn = (By.xpath("//li[@class='Login']/a/div"));
	private By PrimaryUserName = (By.xpath("//form[@name='login-form']/div[2]/input"));
	private By PrimaryLoginPwd = (By.xpath("//input[@placeholder='Enter your password']"));
	private By PrimarySubBtn = (By.xpath("//button[@type='submit']"));
	private By PrimaryHomePage = (By.xpath("//form[@id='search-jobs']/div"));

	public void EnterUrl() throws InterruptedException {

		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
	}

	public void ClickLogin() throws InterruptedException {
		driver.findElement(PrimaryLoginBtn).click();
		Thread.sleep(6000);
	}

	public void EnterUserName() throws InterruptedException {
		driver.findElement(PrimaryUserName)
				.sendKeys("andralokesh9@gmail.com");
		Thread.sleep(2000);
	} 
	public void EnterPassword() throws InterruptedException {
		driver.findElement(PrimaryLoginPwd).sendKeys("Loke9999");
		Thread.sleep(2000);

	}

	public void UserSubmitedButton() throws InterruptedException {
		driver.findElement(PrimarySubBtn).click();
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
	}
public void UserIsonHomePage() throws InterruptedException {
    String expectedSearchjJobTextv = driver.findElement(PrimaryHomePage).getText();
    Assert.assertEquals(expectedSearchjJobTextv, "Search Jobs");
    Thread.sleep(3000);
}
}

