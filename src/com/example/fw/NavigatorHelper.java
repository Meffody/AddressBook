package com.example.fw;

import org.openqa.selenium.By;

public class NavigatorHelper extends HelperBase {

	public NavigatorHelper(ApplicationManager manager) {
		super(manager);
	}
	
	public void openHomePage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4");
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/addressbookv4.1.4/group.php");
	}

	public void gotoGroupsPage() {
		click(By.linkText("groups"));
	}

	public void goToAddNewContactsPage() {
		click(By.linkText("add new"));
	}

	public void returnToGroupPage() {
		click(By.linkText("group page"));
	}

	public void returnHomePage() {
		click(By.linkText("home page"));
	}

}
