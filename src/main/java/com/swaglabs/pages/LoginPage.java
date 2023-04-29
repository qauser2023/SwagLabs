package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	 WebDriver driver; // globallly
	
	private static By username = By.id("user-name");
	private static By password = By.id("password");
	private static By loginBtn = By.id("login-button");
	private static By dashboard = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public ProductPage login()   {
//		UtilityClass.mySendKeys(username, "standard_user");
//		UtilityClass.mySendKeys(password, "secret_sauce");
//		UtilityClass.myClick(loginBtn);
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(loginBtn).click();
		return new ProductPage(driver);
	
	}
	
//	public boolean verifyDashboardHeader() {
//		return UtilityClass.verifyHeader(dashboard);
//	}

}
