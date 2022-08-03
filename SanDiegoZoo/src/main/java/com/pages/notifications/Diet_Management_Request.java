package com.pages.notifications;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Diet_Management_Request extends Base_Class {
	private static By DietManagementRequest = By.xpath("//a[text()='Diet Management Request']");
	private static By Notifications = By.xpath("//*[text()='Notifications'][@class='menu-title app-c-s--nav-title']");
	
	
	public void DietManagementRequest(String value) throws Throwable {
		if (value.equalsIgnoreCase("Diet Management Request")) {
			TC_99_Notifications();
			
		}

	}
	
	public static void TC_99_Notifications() throws Throwable {
		click(Notifications);
		click(DietManagementRequest);
		Thread.sleep(15000);
		verification("//h4[text()='Create Diet Management Request']", "Create Diet Management Request Page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
	
}
