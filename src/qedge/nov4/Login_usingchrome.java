package qedge.nov4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_usingchrome {

	private Object keys;

	public static void main(String[] args)throws Throwable {
		//create instance object for webdriver
		WebDriver driver=new ChromeDriver();
		//launch url in browser
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		Thread.sleep(2000);
		//we can click button in two ways as shown below
		driver.findElement(By.id("login")).click();
		//driver.findElement(By.id("login")).sendKeys(keys.ENTER));
		Thread.sleep(5000);
		driver.close();
		
	}
}
