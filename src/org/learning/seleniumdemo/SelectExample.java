package org.learning.seleniumdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("browser is opened");
		Select sel = new Select(driver.findElementById("month"));
		List<WebElement> list = sel.getOptions();
		List<String> list1 = new ArrayList<String>();
		
		for(WebElement ele: list) {
			list1.add(ele.getText());
		}
		
		System.out.println(list1);
		
		driver.close();
		
		
	}

}
