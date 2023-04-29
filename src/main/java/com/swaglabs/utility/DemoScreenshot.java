package com.swaglabs.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DemoScreenshot {


	public  static WebDriver driver;// int string Class Interface
 
	public static void takeScreenshot() throws IOException {
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile , new File("/Users/mrobi/eclipse-workspace/SwagLabs/myscreenshot.png"));
			
		
			
		
		}
}
