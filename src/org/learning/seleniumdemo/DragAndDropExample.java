package org.learning.seleniumdemo;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		System.out.println("browser is opened");
		
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElementByXPath("//div[@id='draggable']");
		WebElement target = driver.findElementByXPath("//div[@id='droppable']");
		
		act.dragAndDrop(source, target).perform();
		Thread.sleep(5000);

		driver.close();
		
		
	}

}
