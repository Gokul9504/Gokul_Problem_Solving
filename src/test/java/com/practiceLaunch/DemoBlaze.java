package com.practiceLaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);

		System.out.println("---------------------------------------------------------------");
		driver.navigate().to("https://www.demoblaze.com/");
		WebElement phone = driver.findElement(By.xpath("(//*[@class=\"list-group-item\"])[2]"));
		phone.click();
		Thread.sleep(3000);
		System.out.println("Phone");
		List<WebElement> phones = driver.findElements(By.xpath("//*[@class=\"card-title\"]//child::*"));
		for (WebElement x : phones) {
			String text = x.getText();
			System.out.println(text);
		}
		System.out.println("---------------------------------------------------------------");
		WebElement laptop = driver.findElement(By.xpath("(//*[@class=\"list-group-item\"])[3]"));
		laptop.click();
		Thread.sleep(3000);
		System.out.println("Laptops");
		List<WebElement> laptops = driver.findElements(By.xpath("//*[@class=\"card-title\"]//child::*"));
		for (WebElement l : laptops) {
			String texLaptop = l.getText();
			System.out.println(texLaptop);
		}
		System.out.println("---------------------------------------------------------------");
		WebElement monitor = driver.findElement(By.xpath("(//*[@class=\"list-group-item\"])[4]"));
		monitor.click();
		Thread.sleep(3000);
		System.out.println("Monitor's");
		List<WebElement> monitors = driver.findElements(By.xpath("//*[@class=\"card-title\"]//child::*"));
		for (WebElement m : monitors) {
			String textMonitor = m.getText();
			System.out.println(textMonitor);
		}
	}
}