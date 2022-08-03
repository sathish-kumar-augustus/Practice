package com.pages.notifications;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class All_System_Requests extends Base_Class {

	private static By AllSystemRequests = By.xpath("//*[text()='All System Requests']");
	private static By Notifications = By.xpath("//*[text()='Notifications'][@class='menu-title app-c-s--nav-title']");
	private static By Options = By.xpath("//tbody/tr[2]/td[13]/div/button/mat-icon");
	private static By Options_View = By.xpath("//*[text()='View']");
	private static By Options_Clone = By.xpath("//*[text()='Clone']");

	public void AllSystemRequests(String value) throws Throwable {
		if (value.equalsIgnoreCase("All System Requests")) {
			TC_96_Notifications();
			TC_97_Notifications();
			TC_98_Notifications();
		}

	}

	public static void TC_96_Notifications() throws Throwable {
		click(Notifications);
		click(AllSystemRequests);
		Thread.sleep(10000);
		verification("//h4[@class='card-title mb-0'][text()='All System Requests ']",
				"All System Requests List pages got displayed.");
		Thread.sleep(500);
	}

	public static void TC_97_Notifications() throws Throwable {
		click(Options);
		Thread.sleep(1000);
		click(Options_Clone);
		Thread.sleep(3000);
		verification("//h4[text()='Clone Diet Management Request']","Clone Diet Management Request page got displayed");
		Thread.sleep(500);
	}

	public static void TC_98_Notifications() throws Throwable {
		click(AllSystemRequests);
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
