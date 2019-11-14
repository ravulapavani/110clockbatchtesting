package qedge.nov6;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args)throws Throwable {
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println("pagetitle[1]::"+driver.getTitle());
	//click on gmail link
	driver.findElement(By.partialLinkText("Gm")).click();
	Thread.sleep(2000);
	System.out.println("pagetitle[2]::"+driver.getTitle());
			//click on back
	driver.navigate().back();
	Thread.sleep(2000);
	System.out.println("pagetitle[2]::"+driver.getTitle());
	//click on forward
	driver.navigate().forward();
    Thread.sleep(2000);
    System.out.println("pagetitle[3]::"+driver.getTitle());
    //click on refresh
    driver.navigate().refresh();
    Thread.sleep(2000);
   driver.close();
    
    
	
	
	}

}
