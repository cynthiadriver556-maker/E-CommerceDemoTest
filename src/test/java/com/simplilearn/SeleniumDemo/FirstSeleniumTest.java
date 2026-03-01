package com.simplilearn.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		//initialize browser by creating driver instance
		WebDriver driver = new ChromeDriver();
		
		// open website
		driver.get("https://www.google.com");
		
		//print title
		System.out.println("Page Title: " + driver.getTitle());
		
		//Close browser
		driver.quit();

	}

}
