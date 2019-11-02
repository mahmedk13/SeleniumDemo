package org.learning.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDemo {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		System.out.println("browser is opened");
		
		
		

	}

}
