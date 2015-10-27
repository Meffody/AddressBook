package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupDate;

public class GroupHelper extends HelperBase {

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}
	
	
	public List<GroupDate> getGroups() {
		List<GroupDate> groups = new ArrayList<GroupDate>();
		
		manager.navigatorTo().groupsPage();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox: checkboxes) {
			String title = checkbox.getAttribute("title");
			String name = title.substring("Select (".length(), title.length() - ")".length());
			groups.add(new GroupDate().withName(name));
		}
		
		return groups;
	}
	
	public GroupHelper createGroup(GroupDate group) {
		manager.navigatorTo().groupsPage();
		initGroupCreation();
		fillGroupForm(group);
		submitGroupCreation();
		returnToGroupPage();
		return this;	
	}
	

	public GroupHelper deleteGroup(int index) {
		selectGroupByIndex(index);
		submitGroupDeletion();
		returnToGroupPage();
		return this;
	}


	

	public GroupHelper modifyGroup(int index, GroupDate group) {
		manager.navigatorTo().groupsPage();
		initGroupModifications(index);
		fillGroupForm(group);
		submitGroupModifications();
		returnToGroupPage();
		return this;
	}


		//-----------------------------------------------------------------------------------------------------------------------------------------//

	public GroupHelper submitGroupCreation() {
		click(By.name("submit"));
		return this;
	}

	public GroupHelper initGroupCreation() {

		click(By.name("new"));
		return this;
	}
	

	private void submitGroupDeletion() {
		click(By.name("delete"));
	}

	public GroupHelper fillGroupForm(GroupDate group) {
		type(By.name("group_name"), group.getName());
		type(By.name("group_header"), group.getHeader());
		type(By.name("group_footer"), group.getFooter());
		return this;
	}
	
	public GroupHelper returnToGroupPage() {
		click(By.linkText("group page"));
		return this;
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
	}



	public GroupHelper initGroupModifications(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		return this;
		
	}

	public GroupHelper submitGroupModifications() {
		click(By.name("update"));
		return this;
	}




	
	

}
