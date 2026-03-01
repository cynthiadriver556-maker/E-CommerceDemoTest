package com.simplilearn.CynthiaAmazonDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonDemo {

	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		System.out.println("Page Url: " + driver.getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    //WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
		
		//locate searchbox
		WebElement searchfield1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//input search item
		searchfield1.sendKeys("fitbit charge 6");
		
		//locate search submit button
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		
		//Click button
		searchBtn.click();
		Thread.sleep(2000);
		
		//locate item to add to cart
		driver.findElement(By.linkText("Charge 2 Heart Rate + Fitness Wristband, Black, Large (US Version), 1 Count")).click();
		
		//locate add to cart button
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
		
		//locate No Thanks button
		driver.findElement(By.xpath("(//input[@aria-labelledby='attachSiNoCoverage-announce'])[1]")).click();
		
		//Wait for element to be available
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement proceed = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@name='proceedToRetailCheckout'])[1]")));
		
		//locate proceed to checkout
		driver.findElement(By.xpath("(//input[@name='proceedToRetailCheckout'])[1]")).click();
		
		//print Url after clicking proceed to checkout
		System.out.println("Page Url after proceed to checkout " + driver.getCurrentUrl()); 
		driver.findElement(By.partialLinkText("Conditions")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement helpfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("helpsearch")));
		WebElement helpfield2 = driver.findElement(By.id("helpsearch"));
		helpfield2.sendKeys("Customer Support");
		//Thread.sleep(3000);
		driver.findElement(By.id("helpsearch")).submit();
		
		WebElement searchresults = driver.findElement(By.id("help-result-stats"));
		System.out.println("Total search results for Customer Support: " + searchresults);
		//WebElement vitDesc = driver.findElement(By.xpath(//*[text()='vitamins'));
		//System.out.println("Search results for " + vitDesc);
		//String actualRes = driver.findElement(By.xpath("//*[text()= vitamins")).getText();
		//System.out.println("Actual Result: " + actualRes);
		//String expectedRes = "vitamins";
		//System.out.println("Expected Result: " + expectedRes);
		//Assert.assertEquals(actualRes, expectedRes);
		
		
		
		//driver.quit();
		

	}

}
