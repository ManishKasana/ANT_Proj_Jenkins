package org.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	WebDriver driver;
	@Test
	public void logic(){
		System.setProperty("webdriver.chrome.driver","D:/Selenium Set_Up/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.gmail.com");
		

}

}
