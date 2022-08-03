package com.BasePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.Arguments;

import com.Utility.ExcelReader;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static RemoteWebDriver driver = null;

	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

	public static void setup() throws IOException, InterruptedException {

		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
		String UserName = configloader().getProperty("UserName");
		String Password = configloader().getProperty("Password");

		switch (Browser.toUpperCase()) {

		case "CHROME":

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
			break;

		case "FIREFOX":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("The Driver is not defined");
		}

		driver.manage().window().maximize();
		driver.get(Url);
		Thread.sleep(1000);

		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(1000);

	}

	public static void Logout() throws Throwable {
		
		driver.findElement(By.xpath("//a[@id='profileDropdown']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@class='dropdown-item'][3]")).click();
	}

	public static void verification(String element, String StatusMessage) throws Throwable {

		boolean a = driver.findElement(By.xpath(element)).isDisplayed();
		System.out.println(a);
		if (a == true) {

			ExtentTestManager.getTest().log(Status.PASS, StatusMessage);

		}

	}

	public static void input(By element, String Value) throws InterruptedException {

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(Value);

	}

	public static void click(By element) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();

	}

	public void select(String value, By element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();

	}

	public void scrolltoelement(By element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void DownKeyPress() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void EnterKeyPress() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
