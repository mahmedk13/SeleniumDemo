package org.learning.seleniumdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

public class ScreenshotExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		System.out.println("browser is opened");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		//action.moveByOffset(106, 36).click().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Testing']"))).perform();
		
		File src =driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\personal\\test.png"));
		
	}

}
