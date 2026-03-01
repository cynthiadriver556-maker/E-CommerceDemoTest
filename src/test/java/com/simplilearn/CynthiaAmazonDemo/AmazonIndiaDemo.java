package com.simplilearn.CynthiaAmazonDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonIndiaDemo {

		public static void main(String[] args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
			//WebElement searchfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
			
		    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 15 Pro max");
		    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
		    //driver.findElement(By.linkText("iPhone 16 Pro Max 1 TB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Black Titanium")).click();
		    String newwindow = driver.getWindowHandle();
		    System.out.println("New Window is: " + newwindow);
		   driver.switchTo().window("newwindow");
		   System.out.println("Page 1st URL: " + driver.getCurrentUrl());
		   
		   driver.findElement(By.xpath("")).click();
		    
		    //driver.getTitle();
		    System.out.println("Page Url: " + driver.getCurrentUrl());
	}

}
