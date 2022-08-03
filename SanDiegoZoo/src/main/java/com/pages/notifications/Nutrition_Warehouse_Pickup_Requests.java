package com.pages.notifications;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Nutrition_Warehouse_Pickup_Requests extends Base_Class {

	private static By Notifications = By.xpath("//*[text()='Notifications'][@class='menu-title app-c-s--nav-title']");
	private static By Nutrition_Warehouse_Pickup_Requests = By.xpath("//a[text()='Nutrition Warehouse Pickup Requests']");
	
	public void NutritionWarehousePickupRequests(String value) throws Throwable {
		if (value.equalsIgnoreCase("Nutrition Warehouse Pickup Requests")) {
			TC_105_Notifications();
			

		}

	}

	public static void TC_105_Notifications() throws Throwable {
		click(Notifications);
		click(Nutrition_Warehouse_Pickup_Requests);
		Thread.sleep(10000);
		verification("//h4[text()=' Nutrition Warehouse Pickup Request ']", "Nutrition Warehouse Pickup Requests page got displayed.");
		Thread.sleep(500);
		Logout();
	}
}