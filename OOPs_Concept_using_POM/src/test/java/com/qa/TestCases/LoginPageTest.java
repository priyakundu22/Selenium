package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myPages.HomePage;
import com.myPages.LoginPage;
import com.myPages.MyProfile;
import com.qa.Base.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MyProfile myPro;
	
	
	
	public LoginPageTest() {
		super(); //by this keyword all the things will initialize from testbase constructor class
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage = new LoginPage();
		 
	}
	
	@Test
	
	public void loginPageTitleTest() {
		String title = loginPage.assertPageTitle();
		Assert.assertEquals(title, "");
	}
	
	@Test
	public void loginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
