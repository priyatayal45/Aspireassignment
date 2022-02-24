package com.aspireappautomation.utils.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static String configreader(String parameter) throws IOException {
		String filename = System.getProperty("user.dir") + "\\src\\test\\resources\\Config\\Config.properties";
		FileInputStream file = new FileInputStream(filename);
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.getProperty(parameter);
		return value;
	}

	public static WebDriver driverSetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void browserQuit() {
		driver.quit();
	}
}
