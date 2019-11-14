package qedge.nov5;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_gettitle {

	public static void main(String[] args)throws Throwable {
		//launch url
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String expectedtitle="gmail";
	//gettitle of the page
		String actualtitle=driver.getTitle();
		//verify expected title is equal to actual title
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("title is matching::"+expectedtitle+"  "+actualtitle);
		}
		else
		{
			System.out.println("title is not matching::"+expectedtitle+"  "+actualtitle);
		}
		//suspended selenium from execution 5 seconds
		Thread.sleep(5000);
		driver.close();
			
	}

}
