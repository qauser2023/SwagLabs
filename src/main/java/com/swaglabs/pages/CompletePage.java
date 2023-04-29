package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {
	
	WebDriver driver;
	
	By backToHome = By.id("back-to-products");

	
	public CompletePage(WebDriver driver) {
		this.driver = driver;
	}

	public ProductPage backToProductPage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(backToHome).click();
		return new ProductPage(driver);
	}
	
	
}
