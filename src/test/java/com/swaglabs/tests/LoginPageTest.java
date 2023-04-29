package com.swaglabs.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.testng.annotations.Test;
import com.swaglabs.base.BaseClass;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ProductPage;
import com.swaglabs.utility.UtilityClass;

public class LoginPageTest extends BaseClass{
	// we have to bring one driver here
	// driver but invisible 
	LoginPage loginPage;
	ProductPage prodPage;
	@Test
	public void verifyLoginTest() throws IOException {
		loginPage = new LoginPage(driver);
		ProductPage prodPage = new ProductPage(driver);
		prodPage = loginPage.login();
		String actualProdPageTitle = prodPage.getProductPageTitle();
		String expectedProdPageTitle = "Products";
		System.out.println("ACTUAL"+actualProdPageTitle);
		System.out.println("EXPECTED"+expectedProdPageTitle);
		Assert.assertEquals(actualProdPageTitle, expectedProdPageTitle);//
		UtilityClass.takeScreenshot();
	
		
		
	}

	// 5 - framework  java 80% add ins reporting logs screenshot listeners
	
	

}
