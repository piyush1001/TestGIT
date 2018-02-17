package com.org.LearningMaven.TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGithub {
	
	
	@Test
	public void testJenkin(){
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Piyush//Desktop//Selenium//new driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
	       
		System.out.println("Welcome to Jenkins :");
	}

}
