package qedge.nov6;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingforeachloop_links {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoaut.com");
		driver.manage().window().maximize();
		//get collection of links in a page which are under html tag 'a'
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are::"+links.size());
		Thread.sleep(2000);
		for(WebElement each:links)
		{
			//get each link text
			String linkname=each.getText();
			//get each link url
			String linkurl=each.getAttribute("href");
			Thread.sleep(2000);
			System.out.println(linkname+"\n"+linkurl);
		}
		Thread.sleep(2000);
		driver.close();

	}

}