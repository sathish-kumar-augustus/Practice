package com.pages.notifications;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Nutrition_Warehouse_Issue_Sheets extends Base_Class {

	private static By Notifications = By.xpath("//*[text()='Notifications'][@class='menu-title app-c-s--nav-title']");
	private static By NutritionWarehouseIssueSheets = By.xpath("//a[text()='Nutrition Warehouse Issue Sheets']");
	
	public void NutritionWarehouseIssueSheets(String value) throws Throwable {
		if (value.equalsIgnoreCase("Nutrition Warehouse Issue Sheets")) {
			TC_104_Notifications();
			

		}

	}

	public static void TC_104_Notifications() throws Throwable {
		click(Notifications);
		click(NutritionWarehouseIssueSheets);
		Thread.sleep(10000);
		verification("//h4[text()=' Nutrition Warehouse Issue Sheets ']", "Nutrition Warehouse Issue sheets page got displayed.");
		Thread.sleep(500);
		Logout();
	}
}