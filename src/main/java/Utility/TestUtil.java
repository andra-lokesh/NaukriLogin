package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.TestUtility;

public class TestUtil extends TestUtility{
	
	public void ToClick(String getXpath) {
		driver.findElement(By.xpath(getXpath)).click();
		}
	public void ToWrite(String getXpath,String data) {
		driver.findElement(By.xpath(getXpath)).sendKeys(data);
		}
	
	public void fetchText(String getXpath) {
		driver.findElement(By.xpath(getXpath)).click();
		}
	public void ClearText(String getXpath) {
	driver.findElement(By.xpath(getXpath)).clear();
	}
	public void scrollUntilElementViewed(String getXpath) {
		 JavascriptExecutor j = (JavascriptExecutor)driver;
		 j.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(getXpath)));
}
	public static void mouseHoverandClick(String getXPath) {
		WebElement ele = driver.findElement(By.xpath(getXPath));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).click().perform();
	}
	public void mouseHover(String getXPath) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath(getXPath));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		
	}
	
	
		}
