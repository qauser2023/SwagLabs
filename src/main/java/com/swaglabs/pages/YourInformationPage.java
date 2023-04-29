package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage {
	
	WebDriver driver;
	
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	
	public YourInformationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterInformation() {
		driver.findElement(firstName).sendKeys("Sakil");
		driver.findElement(lastName).sendKeys("Hasan");
		driver.findElement(zipCode).sendKeys("10001");
		driver.findElement(continueBtn).click();;
	}
	
	
}
