package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
		
		
		//All validations with Assertion....
		//Title Validation....
		String actualTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		Assert.assertEquals(actualTitle, getTitle);
		
		//Electronoc Devices Validation...
		String EDevices="Electronic Devices";
		String EDgetText=driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")).getText();
		
		Assert.assertEquals(EDevices, EDgetText);
		driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")).click();
		Thread.sleep(3000);
		
		WebElement hover=driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(hover).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'realme Phones')]")).click();
		Thread.sleep(2000);
		
		//Specific Product Choose....
		String PhoneName="Realme C21Y - 4GB RAM/64GB ROM";
		String PhoneNamegetText=driver.findElement(By.xpath("//a[contains(text(),'Realme C21Y - 4GB RAM/64GB ROM')]")).getText();
		
		Assert.assertEquals(PhoneName, PhoneNamegetText);
		driver.findElement(By.xpath("//a[contains(text(),'Realme C21Y - 4GB RAM/64GB ROM')]")).click();
		Thread.sleep(3000);
		
		//Add to Cart....
		driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
		Thread.sleep(3000);
		
		//iframe login....
		WebElement loginiframe=driver.findElement(By.xpath("//iframe[@class='login-iframe']"));
		driver.switchTo().frame(loginiframe);
		
		//login Credentials....
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01624431977");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Muntasir1998");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		//Checkout Validation....
		String CheckoutVd="CHECK OUT";
		String CheckoutVdgetText=driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).getText();
		Assert.assertEquals(CheckoutVd, CheckoutVdgetText);
		driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).click();
		Thread.sleep(3000);
		
		
		
		//All Validations With if/else condition....
		//Title Validation....
		/*String actualTitle="Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
		
		if(getTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Title Match");
			
			//Signup or Login Button Validation...
			String login="Signup / Login";
			String loginText= driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).getText();
			
			if(loginText.equalsIgnoreCase(login)) {
				
				driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01624431977");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Muntasir1998");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
				Thread.sleep(3000);
				
				//Electronoc Devices Validation...
				String EDevices="Electronic Devices";
				String EDgetText=driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")).getText();
				
				if(EDgetText.equalsIgnoreCase(EDevices)) {
					driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")).click();
					Thread.sleep(3000);
				}
				
				else {
					driver.close();
				}
				
				String DeviceCat="Smartphones";
				String DeviceCatgetText=driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).getText();
				
				if(DeviceCatgetText.equalsIgnoreCase(DeviceCat)) {
					driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]")).click();
					Thread.sleep(3000);
				}
				
				else {
					driver.close();
				}
				
				String PhoneName="Realme C21Y - 4GB RAM/64GB ROM";
				String PhoneNamegetText=driver.findElement(By.xpath("//a[contains(text(),'Realme C21Y - 4GB RAM/64GB ROM')]")).getText();
				
				if(PhoneNamegetText.equalsIgnoreCase(PhoneName)) {
					driver.findElement(By.xpath("//a[contains(text(),'Realme C21Y - 4GB RAM/64GB ROM')]")).click();
					Thread.sleep(3000);
				}
				else {
					System.out.println("Phone is note found!!");
					driver.close();
				}
				
				
				//Add to Cart.....
				driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
				Thread.sleep(3000);
				
				//Checkout Validation....
				String CheckoutVd="CHECK OUT";
				String CheckoutVdgetText=driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).getText();
				
				if(CheckoutVdgetText.equalsIgnoreCase(CheckoutVd)) {
					driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).click();
					Thread.sleep(3000);
				}
				
				else {
					System.out.println("Check out button is not found!!");
					driver.close();
				}
				
				
				
				//Logout Code.....
				driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
				Thread.sleep(3000);
			}
			
			else {
				driver.close();
			}
			
		}
		
		
		else {
			System.out.println("Not Match");
			driver.close();
		}*/
		
		
		
	}

}
