package com.myPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class MyProfile extends TestBase{
	
	//Page Factory - OR object repo
	
	@FindBy(name = "username")
	WebElement username;
	
	
	//all the elements will be initialised with driver using this keyword to represent the current class object
	public MyProfile() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	
	public String assertPage() {
		return driver.getTitle();
		
	}
	public void assertName() {
		
	}
	public void verifyDashboard() {
		
	}

}
