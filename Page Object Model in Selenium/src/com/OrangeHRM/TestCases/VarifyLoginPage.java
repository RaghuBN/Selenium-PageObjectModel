package com.OrangeHRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.LoginPageHRM;

public class VarifyLoginPage {

	@Test
	public void ValidateHRMlogin() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 84\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		LoginPageHRM login = new LoginPageHRM(driver);
		
		login.typeUserName("Admin");
		login.typePassword("admin123");
		login.loginButton();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
