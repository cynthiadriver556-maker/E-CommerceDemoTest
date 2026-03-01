package com.simplilearn.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebDriverDemo {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
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
