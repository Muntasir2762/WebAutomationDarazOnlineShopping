package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BasePackage.DriverSetup;

public class TC0001 extends DriverSetup {
	
	public static String baseurl="https://www.daraz.com.bd/";
	
	@Test
	public static void LocateElement() throws InterruptedException {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01624431977");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Muntasir1998");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
		Thread.sleep(3000);
		
	}

}
