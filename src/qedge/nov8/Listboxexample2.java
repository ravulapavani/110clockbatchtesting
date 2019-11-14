package qedge.nov8;



import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxexample2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//store list box into a select class
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		//verify listbox is a single or multi selection
		boolean value=yearlistbox.isMultiple();
		System.out.println("verify listbox is single or multiselection::"+value);
		//get collection of items in listbox
	List<WebElement>olist=yearlistbox.getOptions();
		System.out.println("no of items are::"+olist.size());
		for(int i=1;i<olist.size();i++)
		{
			String itemname=olist.get(i).getText();
			System.out.println("itemname");
			olist.get(i).click();
			
			
		}
		driver.close();
	}

}
