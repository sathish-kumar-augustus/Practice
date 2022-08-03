package com.pages.notifications;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class My_Notifications extends Base_Class {
	
	private static By Notifications = By.xpath("//*[text()='Notifications'][@class='menu-title app-c-s--nav-title']");
	private static By MyNotifications = By.xpath("//*[text()='My Notifications']");
	
	
	public void MyNotifications(String value) throws Throwable {
		if (value.equalsIgnoreCase("My Notifications")) {
			TC_100_Notifications();
			
		}

	}
	
	public static void TC_100_Notifications() throws Throwable {
		click(Notifications);
		click(MyNotifications);
		Thread.sleep(10000);
		verification("//h4[text()=' My Notifications']", "My Notifications page got displayed.");
		Thread.sleep(500);
		Logout();
	}




}
