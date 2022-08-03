package com.pages.reports;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;

public class Inventory_Report extends Base_Class {

	private static By Reports = By.xpath("//span[text()='Reports']");
	private static By InventoryReport= By.xpath("//a[text()='Inventory Report']");

	public void InventoryReport (String value) throws Throwable {
		if (value.equalsIgnoreCase("Inventory Report")) {
			TC_131_Reports();
		}

	}

	public static void TC_131_Reports() throws Throwable {
		click(Reports);
		click(InventoryReport);
		Thread.sleep(10000);
		verification("//h4[text()='Inventory Report']", "Inventory Report page got Displayed.");
		Thread.sleep(500);
		Logout();
	}
}