package org.learning.seleniumdemo;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubeClickExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println("browser is opened");
		
		
		Actions act = new Actions(driver);
		
		/*
		act.contextClick(driver.findElementByXPath("//span[text()='right click me']")).perform();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-copy')]"));
		element.click();
		*/
		act.doubleClick(driver.findElementByXPath("//button[text()='Double-Click Me To See Alert']")).perform();
		
		Thread.sleep(2000);
		Alert alert =driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("text of the alert is: "+text);
		alert.accept();
		Thread.sleep(5000);

		driver.close();
		
		
	}

}
