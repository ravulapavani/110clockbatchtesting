package qedge.nov14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/recharge");
	driver.manage().window().maximize();
	//click on login
	driver.findElement(By.xpath("//li[@class='_26vr']")).click();
	Thread.sleep(5000);
	//get collection of frames
	List<WebElement>oframes=driver.findElements(By.tagName("iframe"));
	System.out.println("no.of frames are::"+oframes.size());
	//switch to frame
	driver.switchTo().frame(0);
	Thread.sleep(5000);
	driver.findElement(By.xpath("")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("pavani123");
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("13324353");
	Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/md-content/button/span")).click();
		//come out of frame
		driver.switchTo().defaultContent();
		//click on close
		driver.findElement(By.xpath("//a[@class='_3i6R']")).click();
		Thread.sleep(5000);	
		//click on gold link on webpage
		driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/ul/li[3]/a/img"));
		Thread.sleep(5000);	
		driver.close();
	}

}
