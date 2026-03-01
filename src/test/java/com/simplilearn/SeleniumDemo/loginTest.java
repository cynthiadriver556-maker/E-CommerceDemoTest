package com.simplilearn.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	
	//Creating driver variable for use
	WebDriver driver;
@BeforeClass
	public void setup() {
		
		//creating driver instance
		driver = new  ChromeDriver();
		//Maximize windown
		driver.manage().window().maximize();
		// Get application url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		
	}
	@AfterClass
	public void tearDown() {
		
	driver.close();	
	driver.quit();
		
	}
	@Test
	public void testloggingIntoApplication() throws InterruptedException{

		Thread.sleep(2000);
		
		
		//locate username and enter value
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		//locate password and enter value
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		//locate login button and click
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type = 'submit']"));
		loginBtn.click();
		Thread.sleep(2000);

		//print title
		System.out.println("Page Title: " + driver.getTitle());
		String actualRes = driver.findElement(By.tagName("h6")).getText();
		System.out.println("Actual Result: " + actualRes);
		String expectedRes = "Dashboard";
		Assert.assertEquals(actualRes, expectedRes);
		Assert.assertEquals(actualRes, expectedRes);
		
		
		//Close browser
		driver.quit();

	}

}
