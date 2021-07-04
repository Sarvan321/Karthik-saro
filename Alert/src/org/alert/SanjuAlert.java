package org.alert;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanjuAlert {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sarav\\eclipse-workspace\\ChromeDrivers\\src\\org\\chromedrivers\\chromedriver.exe");
		WebDriver mouseaction = new ChromeDriver();
		mouseaction.get("http://greenstech.in/selenium-course-content.html");
		mouseaction.manage().window().maximize();
		WebElement course = mouseaction.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[2]/div[1]"));

		JavascriptExecutor jk = (JavascriptExecutor) mouseaction;

		jk.executeScript("arguments[0].scrollIntoView(true)", course);
		Thread.sleep(5000);
		WebElement allCourse = mouseaction.findElement(By.xpath("//*[@id=\"menu-course-new-top-menu\"]/li[2]/a"));
		jk.executeScript("arguments[0].scrollIntoView(false)", allCourse, course);
		allCourse.click();
	}
}