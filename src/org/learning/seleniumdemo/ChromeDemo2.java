package org.learning.seleniumdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo2 {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		System.out.println("browser is opened");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		//driver.findElementById("u_0_m").sendKeys("abc");
		//WebElement nameField = driver.findElementById("u_0_m");
		//nameField.sendKeys("abc");
		
		WebElement searchBox = driver.findElementByName("search");
		searchBox.sendKeys("India");
		System.out.println("i am fetching value from the text box "+searchBox.getAttribute("value"));
		System.out.println("is sign up button displayed "+searchBox.isDisplayed());
		System.out.println("is sign up button displayed "+searchBox.isEnabled());
		
		WebElement downloadText = driver.findElementByXPath("//*[@id=\"www-wikipedia-org\"]/div[8]/div[2]/div/div/strong/a");
		System.out.println(downloadText.getText());
	}

}
