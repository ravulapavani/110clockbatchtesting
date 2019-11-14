package qedge.nov5;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getUrl {

	public static void main(String[] args) throws Throwable{
		WebDriver dr=new ChromeDriver();
		dr.get("http://google.com");
		dr.manage().window().maximize();
		String expurl="http://";
		String acturl=dr.getCurrentUrl();
		//verify url starts with http://
		if(acturl.startsWith(expurl))
		{
			System.out.println("url is secured::"+expurl+" "+acturl);
		}
		else
		{
			System.out.println("url is not secured::"+expurl+" "+acturl);
		}
		Thread.sleep(3000);
		dr.close();
		

	}

}
