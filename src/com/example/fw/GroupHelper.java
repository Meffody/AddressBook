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

	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}

	public void fillGroupForm(GroupDate group) {
		type(By.name("group_name"), group.name);
		type(By.name("group_header"), group.header);
		type(By.name("group_footer"), group.footer);
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
				
	}


	public void initGroupModifications(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		
		
	}

	public void submitGroupModifications() {
		click(By.name("update"));

	}

	public List<GroupDate> getGroups() {
		List<GroupDate> groups = new ArrayList<GroupDate>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox: checkboxes) {
			GroupDate group = new GroupDate();
			String title = checkbox.getAttribute("title");
			group.name = title.substring("Select (".length(), title.length() - ")".length());
			groups.add(group);
		}
		
		return groups;
	}

	
	

}
