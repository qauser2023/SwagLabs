package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	// GLOBAL
	private static By shoppingCart = By.cssSelector("a.shopping_cart_link");
	private static By pageTitle = By.xpath("//span[text()='Products']");
	private static By allIems = By.xpath("(//div[@id='inventory_container'])[2]/div/div");
	private static By backpack = By.xpath("//div[text()='Sauce Labs Backpack']");
	private static By backpackAddToCart = By.id("add-to-cart-sauce-labs-backpack");

	
	public String getProductPageTitle() {
		return driver.findElement(pageTitle).getText();
	}
	
	public int getTotalItem() {
		return driver.findElements(allIems).size();
		
	}
	
	public void viewBackpackItem() {
		driver.findElement(backpack).click();
	}
	
	public void addToCart() {
		driver.findElement(backpackAddToCart).click();
	}
	
	public void clickShoppingCart() {
		driver.findElement(shoppingCart).click();
	}
	
}
