package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.Utill.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	//constructor
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/priyakundu/eclipse-workspace/OOPs_Concept_using_POM/src/main/java/com/qa/Config/Config.properties");
		prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C://Program Files//Google//Chrome//chromedriver_win32.zip/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C://Program Files//Google//Chrome//Application");
			driver = new FirefoxDriver();
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));

}
	

}
