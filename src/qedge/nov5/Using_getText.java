package qedge.nov5;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getText {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		//gettext for register
		String acttext=driver.findElement(By.partialLinkText("REG")).getText();
		String exptext="register";
		if(acttext.equalsIgnoreCase(exptext))
		{
			System.out.println("text is matching::"+acttext+" "+exptext);
		}
		else
		{
			System.out.println("text is not matching::"+acttext+" "+exptext);	
		}
		//get url of register link
		String urlname=driver.findElement(By.partialLinkText("REG")).getAttribute("href");
		System.out.println(urlname);
		Thread.sleep(3000);
		driver.close();
	}

}
