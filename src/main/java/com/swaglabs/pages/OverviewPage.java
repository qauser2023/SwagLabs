package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
	
	WebDriver driver;
	
	By finishBtn = By.id("finish");
	By cancelBtn = By.id("cancel");
	
	public OverviewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickFinishBtn() {
		driver.findElement(finishBtn).click();
	}
	
	
}
