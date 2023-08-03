package com.myPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR object repo
	
		@FindBy(name = "username")
		WebElement username;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(name = "logibButton")
		WebElement logibButton;
		
		
		//all the elements will be initialised with driver using this keyword to represent the current class object
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//actions
		
		public String assertPageTitle() {
			return driver.getTitle();
			
		}
		public MyProfile login(String un, String pw) {
			username.sendKeys(un);
			password.sendKeys(pw);
			logibButton.click();
			
			return new MyProfile();
		}
		
}
