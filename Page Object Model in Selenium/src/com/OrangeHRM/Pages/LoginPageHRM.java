package com.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageHRM {

	WebDriver driver;

	By username = By.id("txtUsername");
	By password = By.name("txtPassword");
	By login = By.xpath("//input[contains(@id,'btnLogin')]");

	public LoginPageHRM(WebDriver driver) {
		this.driver = driver;
	}

	public void typeUserName(String Uname) {
		driver.findElement(username).sendKeys(Uname);
	}

	public void typePassword(String Pword) {
		driver.findElement(password).sendKeys(Pword);
	}

	public void loginButton() {
		driver.findElement(login).click();
	}
}
