package com.EasyCalcul.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.easycalculation.pages.LoginPageEasyCal;

public class VarifyEasyCalLogin {
	@Test
	public void Validatelogin() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome 84\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
        
		LoginPageEasyCal login = new LoginPageEasyCal(driver);
		login.typeEmail();
		login.typePassword();
		login.loginBtn();

		driver.quit();
	}
}
