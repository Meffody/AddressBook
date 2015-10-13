package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	@Test(dataProvider = "randomValidGroupGeneratot")
	public void modifySomeGroup(GroupDate group) {
		app.navigateTo().mainPage();
		
		//save old state
		List<GroupDate> oldList = app.getGroupHelper().getGroups();
		
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size()-1);
		
		//actions
		app.getGroupHelper()
			.initGroupModifications(index)
			.fillGroupForm(group)
			.submitGroupModifications()
			.returnToGroupPage();
		
		//save new state
		List<GroupDate> newList = app.getGroupHelper().getGroups();
		
		//compare states
		oldList.remove(index);
		oldList.add(group);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
		
	}
}
