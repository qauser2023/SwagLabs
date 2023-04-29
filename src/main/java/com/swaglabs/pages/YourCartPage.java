package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
	
	WebDriver driver;
	
	By yourCardTitle = By.xpath("//span[text()='Your Cart']");
	By checkOutBtn = By.id("checkout");
	
	public YourCartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCheckOut() {
		driver.findElement(checkOutBtn).click();
	}
	
	
}
