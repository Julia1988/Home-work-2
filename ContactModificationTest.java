package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
	

	@Test
	public void modifySomeContact () {
		
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification(1);
	    GroupContact contact = new GroupContact();
	    contact.firstname = "new name"; 
	   	app.getContactHelper().returnToHomePage();
	  
	}	

}
