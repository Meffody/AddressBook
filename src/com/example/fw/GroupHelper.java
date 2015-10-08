package com.example.fw;

import org.openqa.selenium.By;

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
		click(By.xpath("//input[@name='selected[]'][" + index + "]"));
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

	
	

}
