package qedge.nov7;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxexample1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//store month list box in to select class
		Select monthlistbox=new Select(driver.findElement(By.id("month")));
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(2000);
		//store year list box in to select class
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		monthlistbox.selectByVisibleText("1992");
		Thread.sleep(2000);
		yearlistbox.selectByValue("1992");
		Thread.sleep(2000);
		monthlistbox.selectByIndex(10);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		yearlistbox.selectByIndex(40);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		driver.close();
		}

}
