package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpresslogin.pages.LoginPage;

public class VarifyWordPressLogin {

	@Test
	public void ValidateWordPresslogin() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 84\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");

		LoginPage login = new LoginPage(driver);

		login.EnterUserName();
		login.EnterPassword();
		login.Clicklogin();
		
		Thread.sleep(5000);
		driver.quit();
				
	}			
}
