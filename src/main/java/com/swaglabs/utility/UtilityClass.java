package com.swaglabs.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.swaglabs.base.BaseClass;

public class UtilityClass extends BaseClass{

	
	// reusable method for click
	
	public static void myClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public static void mySendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
		//screenshot
	}
	
//	public static boolean verifyHeader(By locator) {
//		return driver.findElement(locator).isDisplayed();
//	}
	// clear
	// isDisplayed
	// wait
	
	public static void takeScreenshot() throws IOException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile , new File("/Users/mrobi/eclipse-workspace/SwagLabs/myscreenshot.png"));
		
		}
	}
	

