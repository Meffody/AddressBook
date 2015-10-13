package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {

	public WebDriver driver;
	public String baseUrl;

	private NavigatorHelper navigatorHelper;
	private ContactHelper contactHelper;
	private GroupHelper groupHelper;

	public ApplicationManager() {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void stop() {
		driver.quit();
	}
	
	public NavigatorHelper navigateTo() {
		if (navigatorHelper == null) {
			navigatorHelper = new NavigatorHelper(this);
		}
		return navigatorHelper;
	}
	
	public ContactHelper getContactHelper() {
		if (contactHelper == null) {
			contactHelper = new ContactHelper(this);
		}
		return contactHelper;
	}
	
	public GroupHelper getGroupHelper() {
		if (groupHelper == null) {
			groupHelper = new GroupHelper(this);
		}
		return groupHelper;
	}
	
	

}
