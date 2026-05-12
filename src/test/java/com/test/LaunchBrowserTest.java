package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
	
	@Test
	public void openBrowser() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://altifi.ai/");
	}

}
