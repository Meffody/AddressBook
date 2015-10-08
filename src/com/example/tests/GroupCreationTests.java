package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

	
	@Test(dataProvider = "randomValidGroupGeneratot")
	public void testGroupCreationWithValidData(GroupDate group) throws Exception {
		app.getNavigatorHelper().openMainPage();
		app.getNavigatorHelper().gotoGroupsPage();

		//save old state
		List<GroupDate> oldList = app.getGroupHelper().getGroups();
		
		//actions
		app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(group);
		app.getGroupHelper().submitGroupCreation();
		app.getNavigatorHelper().returnToGroupPage();
		
		//save new state
		List<GroupDate> newList = app.getGroupHelper().getGroups();
		
		//compare states
		oldList.add(group);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}
}
