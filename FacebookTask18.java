package com.guvi.selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookTask18 {

	public static void main(String[] args) throws InterruptedException {
		
		//23rd Session 1
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.facebook.com/"); 
		  System.out.println(driver.getCurrentUrl());
		  driver.findElement(By.linkText("Create new account")).click();
		  driver.findElement(By.name("firstname")).sendKeys("Test");
		  driver.findElement(By.name("lastname")).sendKeys("User");
		  driver.findElement(By.name("reg_email__")).sendKeys("testuser@gmail.com");
		  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@gmail.com");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("ShAn@$21");
		  WebElement Sel=driver.findElement(By.name("birthday_day"));
		  Select day=new Select(Sel);
		  day.selectByValue("11");
		  WebElement Sel1=driver.findElement(By.id("month"));
		  Select month=new Select(Sel1);
		  month.selectByVisibleText("May");
		  WebElement Sel2=driver.findElement(By.id("year"));
		  Select year=new Select(Sel2);
		  year.selectByVisibleText("1985");
		  WebElement Sex=driver.findElement(By.xpath("//input[@value='1']"));
		  Sex.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
		  
	}

}
