package pages;

import org.openqa.selenium.By;

import core.TestUtility;

public class EditProfile extends TestUtility {
	public void editProfile() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
		Thread.sleep(3000);
	}
	public void updateResume() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("D:\\lokeswarnaidu\\A.Lokeshh.docx");
		Thread.sleep(3000);
	}
}

