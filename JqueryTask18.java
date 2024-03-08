package com.guvi.selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryTask18 {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://jqueryui.com/droppable/"); 
		WebElement Frame=  driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame);
		  WebElement element1=driver.findElement(By.id("draggable"));
		  WebElement element2=driver.findElement(By.id("droppable"));
		   Actions action=new Actions(driver);
		   Thread.sleep(1000);
		   action.dragAndDrop(element1, element2)
		    .build()
		    .perform();
		 String x= element2.getText();
		 System.out.println(x);
		 if(x.equalsIgnoreCase("Dropped!")) {
			 System.out.println("Dropped text is successful");
		 }else {
			 System.out.println("Failed");
		 }
		 
	}

}
