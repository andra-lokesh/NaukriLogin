package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestUtility {
	public  static WebDriver driver ;
	
	
public void intiateBrowser(){
    
       
       
      System.setProperty("webdriver.chrome.driver", "C:\\junitwebdriver\\chromedriver.exe");
      driver=new ChromeDriver(); 
     driver.navigate().to("http://www.naukri.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  

}
}
