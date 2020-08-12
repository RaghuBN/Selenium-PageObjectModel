package com.wordpresslogin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By login = By.xpath("//input[contains(@id,'wp-submit')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterUserName() {
		driver.findElement(username).sendKeys("admin");
	}
	
	public void EnterPassword() {
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void Clicklogin() {
		driver.findElement(login).click();
	}
}
