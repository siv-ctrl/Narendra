package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WrapperClass {
	protected WebDriver driver;

	public void LaunchApplication(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				// set chrome browser path
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");

				// Start Edge Session
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);// open url in browser

		} catch (WebDriverException e) {
			System.out.println("browser could not be launched");
		}
	}

	public void quit() {
		driver.close();
	}
}
