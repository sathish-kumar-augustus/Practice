package com.pages.reports;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Inventory_Item_And_Feed_Type_Mapping extends Base_Class {

	private static By Reports = By.xpath("//span[text()='Reports']");
	private static By InventoryItemAndFeedTypeMapping = By.xpath("//a[text()='Inventory Item & Feed Type Mapping']");

	public void InventoryItemAndFeedTypeMapping (String value) throws Throwable {
		if (value.equalsIgnoreCase("Inventory Item And Feed Type Mapping")) {
			TC_130_Reports();
		}

	}

	public static void TC_130_Reports() throws Throwable {
		click(Reports);
		click(InventoryItemAndFeedTypeMapping);
		Thread.sleep(10000);
		verification("//h4[text()='Inventory Item & Feed Type Mapping List']", "Inventory Item and Feed Type Mapping List page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}