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
		 
		String Colour = element2.getCssValue("background-color"); //we can get this CssValue from right hand side of the particular Webelement
		System.out.println(Colour);
		   if(Colour.equals("rgba(255, 250, 144, 1)")) { //we can get this rgba from right hand side of the particular Webelement
			   System.out.println("Background Colour Verified");
		   }else {
			   System.out.println("Background Colour is not Verified");
		   }
		   
		 String x= element2.getText();
		 System.out.println(x);
		 if(x.equalsIgnoreCase("Dropped!")) {
			 System.out.println("Dropped text is successful");
		 }else {
			 System.out.println("Dropped Text is Failed");
		 }
		 
		 
	}

}
