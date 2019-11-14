package qedge.nov6;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Getsize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		WebElement mobiletextbox=driver.findElement(By.name("reg_email__"));
		//get height and width
		Dimension dim=mobiletextbox.getSize();
		System.out.println("height::"+dim.getHeight()+" "+"width::"+dim.getWidth());
		WebElement daylistbox=driver.findElement(By.id("day"));
		Dimension dim1=daylistbox.getSize();
		System.out.println("height::"+dim1.getHeight()+" "+"width::"+dim1.getWidth());
		driver.close();
		

	}

}
