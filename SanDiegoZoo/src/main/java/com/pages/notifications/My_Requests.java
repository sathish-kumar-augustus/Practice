package com.pages.notifications;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class My_Requests extends Base_Class {

	private static By Notifications = By.xpath("//*[text()='Notifications'][@class='menu-title app-c-s--nav-title']");
	private static By MyRequests = By.xpath("//*[text()='My Requests']");
	private static By Options = By.xpath("//tbody//tr[2]//td[8]//div//button");
	private static By Options_View = By.xpath("//*[text()='View']");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");

	public void MyRequests(String value) throws Throwable {
		if (value.equalsIgnoreCase("My Requests")) {
			TC_101_Notifications();
			TC_102_Notifications();
			TC_103_Notifications();

		}

	}

	public static void TC_101_Notifications() throws Throwable {
		click(Notifications);
		click(MyRequests);
		Thread.sleep(10000);
		verification("//h4[text()='My Requests']", "My Requests List page got displayed..");
		Thread.sleep(500);
	}

	public static void TC_102_Notifications() throws Throwable {
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//h4[text()='Clone Diet Management Request']",
				"Clone Diet Management Request page got displayed.");
		Thread.sleep(500);
	}

	public static void TC_103_Notifications() throws Throwable {
		click(MyRequests);
		Thread.sleep(1500);
		click(Options);
		Thread.sleep(1000);
		click(Options_View);
		Thread.sleep(3000);
		verification("//h4[text()='View Diet Management Request']", "View Diet Management Request Page got Displayed.");
		Thread.sleep(500);
		Logout();
	}

}
