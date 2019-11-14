package qedge.nov7;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		//store username textbox into web element
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("Admin");
       //store password textbox into webelement
	    WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("Qedge123!@#");
		//login
		driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Thread.sleep(2000);
		//verify url contains dashboard
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("login success");
			
		}
		else
		{
			//get error message
			String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(message+" "+"login fail");
		}
		Thread.sleep(2000);
		driver.close();
				
			
				
	}

}
