package qedge.nov4;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webtour {

	public static void main(String[] args)throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("REG")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("pavani");
		driver.findElement(By.name("lastName")).sendKeys("kalthireddy");
		driver.findElement(By.name("phone")).sendKeys("8897228651");
		driver.findElement(By.name("userName")).sendKeys("kalthireddypavani@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("ecil");
		driver.findElement(By.name("address2")).sendKeys("Secunderabad");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500062");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.name("email")).sendKeys("pavanikalthireddy");
		driver.findElement(By.name("password")).sendKeys("pavani123");
		driver.findElement(By.name("confirmPassword")).sendKeys("pavani123");
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}