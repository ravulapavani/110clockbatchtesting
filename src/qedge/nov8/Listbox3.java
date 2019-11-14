package qedge.nov8;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Listbox3 {

	public static void main(String[] args) {
	String Expyear="2000";
	boolean itemexist=true;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Select yearlistbox=new Select(driver.findElement(By.id("year")));
	List<WebElement>olist=yearlistbox.getOptions();
	System.out.println("no of items are::"+olist.size());
	for(int i=1;i<olist.size();i++)
	{
	String actitems=olist.get(i).getText();
    System.out.println("actitems");
   if(Expyear.equals(actitems))
   {
	   itemexist=true;
	   break;
   }
					
						
	}
if(itemexist)
{
	System.out.println("item found in listbox::"+Expyear);
}
else
{
	System.out.println("item not found in listbox::"+Expyear);
}
driver.close();
}
}

