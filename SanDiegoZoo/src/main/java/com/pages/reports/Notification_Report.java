package com.pages.reports;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Notification_Report extends Base_Class {

	private static By Reports = By.xpath("//span[text()='Reports']");
	private static By Notification_Report = By.xpath("//a[text()='Notification Report']");

	public void NotificationReport (String value) throws Throwable {
		if (value.equalsIgnoreCase("Notification Report")) {
			TC_132_Reports();
		}

	}

	public static void TC_132_Reports() throws Throwable {
		click(Reports);
		click(Notification_Report);
		Thread.sleep(10000);
		verification("//h4[text()=' Notification Report ']", "Notification Report page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}