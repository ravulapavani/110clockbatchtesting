package qedge.nov6;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getlocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		WebElement mobiletextbox=driver.findElement(By.name("reg_email__"));
		Point p=mobiletextbox.getLocation();
		System.out.println("x-corordinate::"+p.getX()+" "+"y-coordinate::"+p.getY());
		WebElement newpasswordtextbox=driver.findElement(By.name("reg_passwd__"));
		Point p1=newpasswordtextbox.getLocation();
		System.out.println("x-corordinate::"+p1.getX()+" "+"y-coordinate::"+p1.getY());
		driver.close();

	}

}
