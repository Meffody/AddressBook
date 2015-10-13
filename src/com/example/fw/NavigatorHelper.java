package com.example.fw;

import org.openqa.selenium.By;

public class NavigatorHelper extends HelperBase {

	public NavigatorHelper(ApplicationManager manager) {
		super(manager);
	}
	
	public void openHomePage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4");
	}

	public void mainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/group.php");
	}

	public void groupsPage() {
		click(By.linkText("groups"));
	}

	public void goToAddNewContactsPage() {
		click(By.linkText("add new"));
	}


	public void returnHomePage() {
		click(By.linkText("home page"));
	}

}
