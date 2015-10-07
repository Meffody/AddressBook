package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	@Test
	public void testNonEmptyGroupCreation() throws Exception {
		app.getNavigatorHelper().openMainPage();
		app.getNavigatorHelper().gotoGroupsPage();
		app.getGroupHelper().initGroupCreation();
		GroupDate group = new GroupDate();
		group.name = "name1";
		group.header = "header1";
		group.footer = "footer1";
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupCreation();
		app.getNavigatorHelper().returnToGroupPage();
	}

	@Test
	public void testEmptyGroupCreation() throws Exception {
		app.getNavigatorHelper().openMainPage();
		app.getNavigatorHelper().gotoGroupsPage();
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(new GroupDate("", "", ""));
		app.getGroupHelper().submitGroupCreation();
		app.getNavigatorHelper().returnToGroupPage();
	}
}
