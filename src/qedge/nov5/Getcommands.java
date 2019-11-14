package qedge.nov5;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Getcommands {

	public static void main(String[] args)throws Throwable {
		//launch irl
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("//yahoo.com");
		driver.manage().window().maximize();
		//print title of the page and length of the title
		String pagetitle=driver.getTitle();
		System.out.println("page title is::"+pagetitle);
		System.out.println("page length title is::"+pagetitle.length());
		//print url of the page and length of the url
		String strurl=driver.getCurrentUrl();
		System.out.println("url of the page is::"+strurl);
		System.out.println("url length of the page is::"+strurl.length());
		Thread.sleep(3000);
		}
}
