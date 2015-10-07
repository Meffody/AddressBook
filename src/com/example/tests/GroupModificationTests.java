package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	@Test
	public void modifySomeGroup() {
		app.getNavigatorHelper().openMainPage();
		app.getGroupHelper().initGroupModifications(1);
		GroupDate group = new GroupDate();
		group.name = "new name";
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupModifications();
		app.getNavigatorHelper().returnToGroupPage();
		
	}
}
