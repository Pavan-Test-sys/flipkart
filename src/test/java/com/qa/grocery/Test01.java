package com.qa.grocery;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test01 {
	
	
	public RemoteWebDriver driver;
	
	
	@Test
	public void method(){
		driver=new ChromeDriver();
		
	}
	
	
	@Test
	public void method1() throws Exception{
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
	}
	
	
	@Test
	public void method2() throws Exception{
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		
	}
	
	@Test
	public void method3(){
		
		driver.findElement(By.xpath("//span[text()='Kilos']")).click();
	}
	
	

	@Test
	public void method4() throws Exception{
		
		driver.navigate().back();
		Thread.sleep(10000);
		driver.close();
	}
	
	
	

}
